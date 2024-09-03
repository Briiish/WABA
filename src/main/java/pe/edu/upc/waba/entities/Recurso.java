package pe.edu.upc.waba.entities;

import jakarta.persistence.*;

public class Recurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int idRecu;
    @Column(name = "cicloRecu",nullable = false,length = 7)
    private String cicloRecu;
    @ManyToOne
    @JoinColumn(name = "Curso_idCur")
    private  Curso cu;
    @ManyToOne
    @JoinColumn(name = "User_id")
    private  User us;

    public Recurso() {
    }

    public Recurso(int idRecu, String cicloRecu, Curso cu, User us) {
        this.idRecu = idRecu;
        this.cicloRecu = cicloRecu;
        this.cu = cu;
        this.us = us;
    }

    public int getIdRecu() {
        return idRecu;
    }

    public void setIdRecu(int idRecu) {
        this.idRecu = idRecu;
    }

    public String getCicloRecu() {
        return cicloRecu;
    }

    public void setCicloRecu(String cicloRecu) {
        this.cicloRecu = cicloRecu;
    }

    public Curso getCu() {
        return cu;
    }

    public void setCu(Curso cu) {
        this.cu = cu;
    }

    public User getUs() {
        return us;
    }

    public void setUs(User us) {
        this.us = us;
    }
}
