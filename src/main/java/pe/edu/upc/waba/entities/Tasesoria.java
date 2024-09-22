package pe.edu.upc.waba.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Tasesoria")
public class Tasesoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAs;

    @Column(name = "tipoAs", nullable = false)
    private String tipoAs;

    public Tasesoria() {
    }

    public Tasesoria(int idAs, String tipoAs) {
        this.idAs = idAs;
        this.tipoAs = tipoAs;
    }

    public int getIdAs() {
        return idAs;
    }

    public void setIdAs(int idAs) {
        this.idAs = idAs;
    }

    public String getTipoAs() {
        return tipoAs;
    }

    public void setTipoAs(String tipoAs) {
        this.tipoAs = tipoAs;
    }
}
