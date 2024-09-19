package pe.edu.upc.waba.serviceinterfaces;

import pe.edu.upc.waba.entities.Comentario;

import pe.edu.upc.waba.entities.Modalidad;


import java.util.List;

public interface IComentarioService {
    public List<Comentario> list();

    public void insert(Comentario comentario);

    public Comentario ListId(int id);

    public void update(Comentario c);

    public void delete(int id);

}
