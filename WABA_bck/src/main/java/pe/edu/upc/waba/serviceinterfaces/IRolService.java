package pe.edu.upc.waba.serviceinterfaces;

import pe.edu.upc.waba.entities.Rol;

import java.util.List;

public interface IRolService {
    public void insert(Rol rol);

    public List<Rol> list();
    public void update(Rol rol);

    public void delete(int idRol);

    public Rol listarId(int idRol);
}
