package pe.edu.upc.waba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.waba.entities.Recurso;

import java.util.List;

@Repository
public interface IRecursoRepository extends JpaRepository<Recurso,Integer> {
}
