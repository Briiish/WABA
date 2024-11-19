package pe.edu.upc.waba.dtos;

import pe.edu.upc.waba.entities.Modalidad;
import pe.edu.upc.waba.entities.Profesor;
import pe.edu.upc.waba.entities.Tasesoria;
import pe.edu.upc.waba.entities.Users;

import java.time.LocalDate;
import java.time.LocalTime;


public class ReservaAsesoriaDTO {

    private int idRes;
    private LocalDate fechaRes;
    private LocalTime hInicioRes;
    private LocalTime hFinRes;
    private String viaRes;

    private Profesor Pro;
    private Users Us;
    private Modalidad Mo;
    private Tasesoria Tase;

    public int getIdRes() {
        return idRes;
    }

    public void setIdRes(int idRes) {
        this.idRes = idRes;
    }

    public LocalDate getFechaRes() {
        return fechaRes;
    }

    public void setFechaRes(LocalDate fechaRes) {
        this.fechaRes = fechaRes;
    }

    public LocalTime gethInicioRes() {
        return hInicioRes;
    }

    public void sethInicioRes(LocalTime hInicioRes) {
        this.hInicioRes = hInicioRes;
    }

    public LocalTime gethFinRes() {
        return hFinRes;
    }

    public void sethFinRes(LocalTime hFinRes) {
        this.hFinRes = hFinRes;
    }

    public String getViaRes() {
        return viaRes;
    }

    public void setViaRes(String viaRes) {
        this.viaRes = viaRes;
    }

    public Profesor getPro() {
        return Pro;
    }

    public void setPro(Profesor pro) {
        Pro = pro;
    }

    public Users getUs() {
        return Us;
    }

    public void setUs(Users us) {
        Us = us;
    }

    public Modalidad getMo() {
        return Mo;
    }

    public void setMo(Modalidad mo) {
        Mo = mo;
    }

    public Tasesoria getTase() {
        return Tase;
    }

    public void setTase(Tasesoria tase) {
        Tase = tase;
    }
}
