package pe.edu.upc.waba.serviceinterfaces;

import pe.edu.upc.waba.entities.Recurso;

import java.util.List;

public interface IRecursoService {
    public List<Recurso> list();
    public void insert(Recurso rc);
    List<String[]> hrxp();
}
