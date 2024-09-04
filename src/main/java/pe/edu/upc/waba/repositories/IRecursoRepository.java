package pe.edu.upc.waba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.waba.entities.Recurso;

import java.util.List;

@Repository
public interface IRecursoRepository extends JpaRepository<Recurso,Integer> {
    @Query(value = "SELECT p.nombre_profesor, ROUND(SUM(EXTRACT(EPOCH FROM (p.hora_final_reserva - p.hora_inicio_reserva)) / 3600), 1) AS horas_reservadas " +
            "FROM reserva r " +
            "INNER JOIN profesor p ON r.profesorid = p.id_profesor " +
            "GROUP BY p.id_profesor " +
            "ORDER BY horas_reservadas DESC ", nativeQuery = true)
    List<String[]> hrxp();
}
