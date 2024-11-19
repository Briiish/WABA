package pe.edu.upc.waba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pe.edu.upc.waba.entities.Modalidad;

import java.util.List;

public interface IModalidadRepository extends JpaRepository<Modalidad,Integer> {
    @Query("Select m from Modalidad m where m.descriMo like %:modalidad%")
    public List<Modalidad> buscarModalidad(@Param("modalidad") String modalidad);
}
