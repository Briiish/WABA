package pe.edu.upc.waba.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Tasesoria")
public class Tasesoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAs;

    @Column(name = "tipoAs", nullable = false)
    private int tipoAs;

    public Tasesoria() {
    }

    public Tasesoria(int idAs, int tipoAs) {
        this.idAs = idAs;
        this.tipoAs = tipoAs;
    }

    public int getIdAs() {
        return idAs;
    }

    public void setIdAs(int idAs) {
        this.idAs = idAs;
    }

    public int getTipoAs() {
        return tipoAs;
    }

    public void setTipoAs(int tipoAs) {
        this.tipoAs = tipoAs;
    }
}
