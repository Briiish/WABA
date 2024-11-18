package pe.edu.upc.waba.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.waba.entities.ReservaAsesoria;

import java.util.List;

@Repository
public interface IReservaAsesoriaRepository extends JpaRepository<ReservaAsesoria, Integer> {

    @Query(value = "SELECT \n" +
            "    m.descri_mo AS Modalidad,\n" +
            "    COUNT(r.id_res) AS CantidadReservas\n" +
            "FROM \n" +
            "    reserva_asesoria r\n" +
            "JOIN \n" +
            "    modalidad m ON r.id_mo = m.id_mo\n" +
            "GROUP BY \n" +
            "    m.descri_mo", nativeQuery = true)
    public List<String[]> cantidad();

    @Query(value = "SELECT \n" +
            "    p.turno_profe,\n" +
            "    COUNT(r.id_res) AS cantidad_reservas\n" +
            "FROM \n" +
            "    reserva_asesoria r\n" +
            "JOIN \n" +
            "    profesor p ON r.id_profe = p.id_profe\n" +
            "GROUP BY \n" +
            "    p.turno_profe;", nativeQuery = true)
    public List<String[]> turno();
}
