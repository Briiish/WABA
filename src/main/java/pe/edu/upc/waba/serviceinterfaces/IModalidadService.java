package pe.edu.upc.waba.serviceinterfaces;

import pe.edu.upc.waba.entities.Modalidad;

import java.util.List;

public interface IModalidadService {
    public List<Modalidad> list();

    public void insert(Modalidad modalidad);

    public Modalidad ListId(int id);

    public void update(Modalidad a);

    public void delete(int id);

    public List<Modalidad> buscarModalidad(String modalidad);
}
