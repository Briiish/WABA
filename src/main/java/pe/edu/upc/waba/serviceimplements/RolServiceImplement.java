package pe.edu.upc.waba.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.waba.entities.Rol;
import pe.edu.upc.waba.repositories.IRolRepository;
import pe.edu.upc.waba.serviceinterfaces.IRolService;

import java.util.List;

@Service
public class RolServiceImplement implements IRolService {

    @Autowired
    private IRolRepository rR;


    @Override
    public void insert(Rol rol) {
        rR.save(rol);
    }

    @Override
    public List<Rol> list() {
        return rR.findAll();
    }

    @Override
    public void update(Rol rol) {
        rR.save(rol);
    }

    @Override
    public void delete(int idRol) {
        rR.deleteById(idRol);
    }

    @Override
    public Rol listarId(int idRol) {
        return rR.findById(idRol).orElse(new Rol());
    }
}
