package pe.edu.upc.waba.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.waba.entities.Profesor;
import pe.edu.upc.waba.repositories.IProfesorRepository;
import pe.edu.upc.waba.serviceinterfaces.IProfesorService;

import java.util.List;
@Service
public class ProfesorServiceImplement implements IProfesorService {
    @Autowired
    private IProfesorRepository pR;

    @Override
    public List<Profesor> list() {
        return pR.findAll();
    }

    @Override
    public void insert(Profesor profesor) {
         pR.save(profesor);
    }

    @Override
    public Profesor ListId(int id) {
        return pR.findById(id).orElse(new Profesor());
    }

    @Override
    public void update(Profesor a) {
        pR.save(a);
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

}
