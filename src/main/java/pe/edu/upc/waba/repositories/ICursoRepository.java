package pe.edu.upc.waba.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.edu.upc.waba.entities.Curso;


import java.util.List;


@Repository

public interface ICursoRepository extends JpaRepository<Curso, Integer> {
    @Query("Select c from Curso c where c.descriCur like %:curso%")
    public List<Curso> buscarCurso(@Param("curso") String curso);


}
