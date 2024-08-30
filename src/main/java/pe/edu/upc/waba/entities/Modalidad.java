package pe.edu.upc.waba.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Modalidad")
public class Modalidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMo;
    @Column(name = "descriMo", length = 70, nullable = false)
    private String descriMo;

    public Modalidad() {
    }

    public Modalidad(int idMo, String descriMo) {
        this.idMo = idMo;
        this.descriMo = descriMo;
    }

    public int getIdMo() {
        return idMo;
    }

    public void setIdMo(int idMo) {
        this.idMo = idMo;
    }

    public String getDescriMo() {
        return descriMo;
    }

    public void setDescriMo(String descriMo) {
        this.descriMo = descriMo;
    }
}
