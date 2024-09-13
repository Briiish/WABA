package pe.edu.upc.waba.dtos;

import pe.edu.upc.waba.entities.Users;

public class RolDTO {
    private int idRol;
    private String rol;
    private Users user;

    public int getId() {
        return idRol;
    }

    public void setId(int id) {
        this.idRol = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }
}
