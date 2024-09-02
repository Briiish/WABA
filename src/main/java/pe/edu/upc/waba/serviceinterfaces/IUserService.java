package pe.edu.upc.waba.serviceinterfaces;

import pe.edu.upc.waba.entities.Users;

import java.util.List;

public interface IUserService {
    public void insert(Users usuario);

    public List<Users> list();

    public void delete(int id);

    public Users listarId(int id);
}
