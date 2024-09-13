package pe.edu.upc.waba.serviceinterfaces;

import pe.edu.upc.waba.entities.Curso;

import java.util.List;

public interface ICursoService {

    public List<Curso> list();

    public void insert(Curso curso);

    public Curso ListId(int id);

    public void update(Curso u);

    public void delete(int id);

    
    public List<Curso> buscarCurso(String curso);
}
