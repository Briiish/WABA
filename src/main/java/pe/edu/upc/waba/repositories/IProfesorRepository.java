package pe.edu.upc.waba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.waba.entities.Profesor;

import java.util.List;

@Repository
public interface IProfesorRepository extends JpaRepository<Profesor,Integer> {
    @Query(value = "SELECT p.nombre_profe, \n" +
            "ROUND(SUM(EXTRACT(EPOCH FROM (r.h_fin_res - r.h_inicio_res/ 3600), 1)\n" +
            "AS horas_reservadas\n" +
            "FROM reserva r \n" +
            "INNER JOIN profesor p ON r.id_profe = p.id_profe \n" +
            "GROUP BY p.id_profe \n" +
            "ORDER BY horas_reservadas DESC ", nativeQuery = true)
    List<String[]> hrxp();
}
