package pe.edu.upc.waba.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.waba.entities.ReservaAsesoria;
import pe.edu.upc.waba.repositories.IReservaAsesoriaRepository;
import pe.edu.upc.waba.serviceinterfaces.IReservaAsesoriaService;

import java.util.List;

@Service
public class ReservaAsesoriaImplement implements IReservaAsesoriaService {

    @Autowired
    private IReservaAsesoriaRepository raR;

    @Override
    public void insert(ReservaAsesoria ra) {
        raR.save(ra);
    }

    @Override
    public void update(ReservaAsesoria ra) {
        raR.save(ra);
    }

    @Override
    public void delete(int id) {
        raR.deleteById(id);
    }

    @Override
    public List<ReservaAsesoria> list() {
        return raR.findAll();
    }

    @Override
    public ReservaAsesoria listId(int id) {
        return raR.findById(id).orElse(null);
    }

    @Override
    public List<String[]> cantidad() {
        return raR.cantidad();
    }

    @Override
    public List<String[]> turno() {
        return raR.turno();
    }


}
