package pe.edu.upc.waba.dtos;


import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import pe.edu.upc.waba.entities.Profesor;

public class ComentarioDTO {
    private int idCo;
    private double puntosCo;
    private String resenaCo;
    private Profesor Pro;

    public int getIdCo() {
        return idCo;
    }

    public void setIdCo(int idCo) {
        this.idCo = idCo;
    }

    public double getPuntosCo() {
        return puntosCo;
    }

    public void setPuntosCo(double puntosCo) {
        this.puntosCo = puntosCo;
    }

    public String getResenaCo() {
        return resenaCo;
    }

    public void setResenaCo(String resenaCo) {
        this.resenaCo = resenaCo;
    }

    public Profesor getPro() {
        return Pro;
    }

    public void setPro(Profesor pro) {
        Pro = pro;
    }
}

