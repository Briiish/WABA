package pe.edu.upc.waba.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.waba.entities.Modalidad;
import pe.edu.upc.waba.repositories.IModalidadRepository;
import pe.edu.upc.waba.serviceinterfaces.IModalidadService;

import java.util.List;

@Service
public class ModalidadServiceImplement implements IModalidadService {
    @Autowired
    private IModalidadRepository mR;

    @Override
    public List<Modalidad> list() {
        return mR.findAll();
    }

    @Override
    public void insert(Modalidad modalidad) {
        mR.save(modalidad);
    }

    @Override
    public Modalidad ListId(int id) {
        return mR.findById(id).orElse(new Modalidad());
    }

    @Override
    public void update(Modalidad a) {
        mR.save(a);
    }

    @Override
    public void delete(int id) {
        mR.deleteById(id);
    }

    @Override
    public List<Modalidad> buscarModalidad(String modalidad){
        return mR.buscarModalidad(modalidad);
    }
}
