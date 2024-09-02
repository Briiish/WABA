package pe.edu.upc.waba.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.waba.entities.Curso;
import pe.edu.upc.waba.repositories.ICursoRepository;
import pe.edu.upc.waba.serviceinterfaces.ICursoService;

import java.util.List;

@Service
public class CursoServiceImplement implements ICursoService {
    @Autowired
    private ICursoRepository cR;

    @Override
    public List<Curso> list() {
        return cR.findAll();
    }

    @Override
    public void insert (Curso curso) {
        cR.save(curso);
    }

    @Override
    public Curso ListId(int id) {
        return cR.findById(id).orElse(new Curso());
    }

    @Override
    public void update(Curso u) {
        cR.save(u);
    }

    @Override
    public void delete(int id) {
        cR.deleteById(id);
    }

    @Override
    public List<Curso> buscarCurso(String curso) {
        return cR.buscarCurso(curso);    }
}
