package pe.edu.upc.waba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.waba.entities.Profesor;

import java.util.List;

@Repository
public interface IProfesorRepository extends JpaRepository<Profesor,Integer> {
    @Query(value = "SELECT p.nombre_profe, ROUND(SUM(EXTRACT(EPOCH FROM (r.h_fin_res - r.h_inicio_res)) / 3600), 1) AS horas_reservadas\n" +
            "FROM profesor p \n" +
            "INNER JOIN reserva_asesoria r ON p.id_profe = r.id_profe\n" +
            "GROUP BY p.nombre_profe", nativeQuery = true)
    List<String[]> hrxp();

    @Query(value = "SELECT p.nombre_Profe AS nameProfesor,\n" +
            "AVG(c.puntos_Co) AS cantidadPuntos\n" +
            "FROM comentario c \n" +
            "INNER JOIN profesor p ON c.id_Profe = p.id_Profe\n" +
            "GROUP BY p.nombre_Profe\n" +
            "HAVING AVG(c.puntos_co) BETWEEN 0 AND 10", nativeQuery = true)
    List<String[]> cpxp();
}
