package pe.edu.upc.waba.serviceinterfaces;


import pe.edu.upc.waba.entities.Tasesoria;

import java.util.List;

public interface ITasesoriaService {

    public List<Tasesoria> list();

    public void insert(Tasesoria tasesoria);

    public Tasesoria listId(int id);

    public void update(Tasesoria tasesoria);

    public void delete(int id);

}
