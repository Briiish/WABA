package pe.edu.upc.waba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< Updated upstream
import org.springframework.stereotype.Repository;
import pe.edu.upc.waba.entities.Comentario;

@Repository
public interface IComentarioRepository extends JpaRepository<Comentario,Integer> {
}

=======
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.waba.entities.Comentario;

import java.util.List;

@Repository
public interface IComentarioRepository extends JpaRepository<Comentario,Integer> {

}
>>>>>>> Stashed changes
