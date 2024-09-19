package pe.edu.upc.waba.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.waba.entities.Comentario;
import pe.edu.upc.waba.repositories.IComentarioRepository;
import pe.edu.upc.waba.serviceinterfaces.IComentarioService;

import java.util.List;

@Service
public class ComentarioServiceImplement implements IComentarioService {
    @Autowired
    private IComentarioRepository cR;

    @Override
    public List<Comentario> list() {
        return cR.findAll();
    }

    @Override
    public void insert(Comentario comentario) {
        cR.findAll();
    }

    @Override
    public Comentario ListId(int id) {
        return cR.findById(id).orElse(new Comentario());
    }

    @Override
    public void update(Comentario c) {
        cR.save(c);
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }
<<<<<<< Updated upstream
}
=======

}
>>>>>>> Stashed changes
