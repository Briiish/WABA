package pe.edu.upc.waba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.waba.entities.Profesor;

import java.util.List;

@Repository
public interface IProfesorRepository extends JpaRepository<Profesor,Integer> {
    @Query(value = "SELECT p.nombre_profe, ROUND(SUM(EXTRACT(EPOCH FROM (r.h_fin_res - r.h_inicio_res)) / 3600), 1) AS horas_reservadas\n" +
            "FROM reserva_asesoria r \n" +
            "INNER JOIN profesor p ON r.id = p.id_profe\n" +
            "GROUP BY p.id_profe\n" +
            "ORDER BY horas_reservadas DESC", nativeQuery = true)
    List<String[]> hrxp();
}
