package pe.edu.upc.waba.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "users")
public class Users implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 30, unique = true)
    private String username;

    @Column(name = "FregUs",nullable = false)
    private LocalDate fregUs;

    @Column(name = "CodigoUs",length = 50,nullable = false)
    private String codigoUs;

    @Column(name = "NombreUs",length = 50,nullable = false)
    private String nombreUs;

    @Column(name = "ApellidoUs",length = 50,nullable = false)
    private String apellidoUs;

    @Column(name = "FnacUs",nullable = false)
    private LocalDate fnacUs;

    @Column(name = "CorreoUs",length = 50,nullable = false)
    private String correoUs;

    @Column(length = 200)
    private String password;

    private Boolean enabled;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Rol> roles;

    public Users() {
    }

    public Users(int id, String username, LocalDate fregUs, String codigoUs, String nombreUs, String apellidoUs, LocalDate fnacUs, String correoUs, String password, Boolean enabled, List<Rol> roles) {
        this.id = id;
        this.username = username;
        this.fregUs = fregUs;
        this.codigoUs = codigoUs;
        this.nombreUs = nombreUs;
        this.apellidoUs = apellidoUs;
        this.fnacUs = fnacUs;
        this.correoUs = correoUs;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
    }

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

    public LocalDate getFregUs() {
        return fregUs;
    }

    public void setFregUs(LocalDate fregUs) {
        this.fregUs = fregUs;
    }

    public String getCodigoUs() {
        return codigoUs;
    }

    public void setCodigoUs(String codigoUs) {
        this.codigoUs = codigoUs;
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

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
}
