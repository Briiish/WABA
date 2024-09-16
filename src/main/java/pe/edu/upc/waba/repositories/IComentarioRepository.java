package pe.edu.upc.waba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.waba.entities.Comentario;

@Repository
public interface IComentarioRepository extends JpaRepository<Comentario,Integer> {
}

