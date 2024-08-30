package pe.edu.upc.waba.serviceinterfaces;

import pe.edu.upc.waba.entities.Profesor;

import java.util.List;

public interface IProfesorService {
    public List<Profesor> list();
    public void insert(Profesor profesor);
    public Profesor ListId(int id);
    public void update(Profesor a);
    public void delete(int id);

}
