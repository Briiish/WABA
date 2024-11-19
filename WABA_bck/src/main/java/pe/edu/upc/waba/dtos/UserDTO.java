package pe.edu.upc.waba.dtos;

import java.time.LocalDate;

public class UserDTO {
    private int id;

    private String username;
    private String password;
    private Boolean enabled;
    private String codigoUs;
    private LocalDate fregUs;
    private String nombreUs;
    private String apellidoUs;
    private LocalDate fnacUs;
    private String correoUs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getCodigoUs() {
        return codigoUs;
    }

    public void setCodigoUs(String codigoUs) {
        this.codigoUs = codigoUs;
    }

    public LocalDate getFregUs() {
        return fregUs;
    }

    public void setFregUs(LocalDate fregUs) {
        this.fregUs = fregUs;
    }

    public String getNombreUs() {
        return nombreUs;
    }

    public void setNombreUs(String nombreUs) {
        this.nombreUs = nombreUs;
    }

    public String getApellidoUs() {
        return apellidoUs;
    }

    public void setApellidoUs(String apellidoUs) {
        this.apellidoUs = apellidoUs;
    }

    public LocalDate getFnacUs() {
        return fnacUs;
    }

    public void setFnacUs(LocalDate fnacUs) {
        this.fnacUs = fnacUs;
    }

    public String getCorreoUs() {
        return correoUs;
    }

    public void setCorreoUs(String correoUs) {
        this.correoUs = correoUs;
    }
}
