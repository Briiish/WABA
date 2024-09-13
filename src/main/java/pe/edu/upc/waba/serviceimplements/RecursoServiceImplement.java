package pe.edu.upc.waba.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.waba.entities.Recurso;
import pe.edu.upc.waba.repositories.IRecursoRepository;
import pe.edu.upc.waba.serviceinterfaces.IRecursoService;

import java.util.List;

@Service
public class RecursoServiceImplement implements IRecursoService {

    @Autowired
    private IRecursoRepository rR;

    @Override
    public List<Recurso> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Recurso rc) {
        rR.save(rc);
    }



}
