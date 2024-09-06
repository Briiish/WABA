package pe.edu.upc.waba.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.edu.upc.waba.entities.Users;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IUserRepository extends JpaRepository<Users, Integer> {
    public Users findByUsername(String username);

    //BUSCAR POR NOMBRE DE USUARIO
    @Query("select count(u.username) from Users u where u.username =:username")
    public int buscarUsername(@Param("username") String nombre);


    //INSERTAR ROLES
    @Transactional
    @Modifying
    @Query(value = "insert into roles (rol, user_id) VALUES (:rol, :user_id)", nativeQuery = true)
    public void insRol(@Param("rol") String authority, @Param("user_id") Long user_id);


    //QUERY 3 HRXA
    @Query(value = "SELECT u.nombre_us, ROUND(SUM(EXTRACT(EPOCH FROM (r.h_fin_res - r.h_inicio_res)) / 3600), 1) AS horas_reservadas\n" +
            "FROM reserva_asesoria r \n" +
            "INNER JOIN users u ON r.id = u.id \n" +
            "GROUP BY u.id\n" +
            "ORDER BY horas_reservadas DESC", nativeQuery = true)
    List<String[]> hrxa();

    //QUERY 4 AXRT
    @Query("select count(u) from Users u where u.fregUs between :startDate and :endDate")
    int axrt(@Param("startDate") LocalDate startDate, @Param("endDate") LocalDate endDate);


}
