package pe.edu.upc.waba.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCo;

    @Column(name = "puntosCo", nullable = false)
    private double puntosCo;

    @Column(name = "resenaCo", length = 50, nullable = false)
    private String resenaCo;

    @ManyToOne
    @JoinColumn(name = "idProfe", nullable = false)
    private Profesor Pro;

    public Comentario() {
    }

    public Comentario(int idCo, double puntosCo, String resenaCo, Profesor pro) {
        this.idCo = idCo;
        this.puntosCo = puntosCo;
        this.resenaCo = resenaCo;
        Pro = pro;
    }

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
