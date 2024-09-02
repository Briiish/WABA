package pe.edu.upc.waba.entities;


import jakarta.persistence.*;

@Entity
@Table(name="Curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCur;
    @Column (name = "descriCur", length = 70, nullable = false)
    private String descriCur;

    public Curso(){
    }

    public Curso(int idCur, String descriCur){
        this.idCur = idCur;
        this.descriCur = descriCur;
    }

    public int getIdCur() {
        return idCur;
    }
    public void setIdCur(int idCur) {
        this.idCur = idCur;
    }

    public String getDescriCur() {
        return descriCur;
    }
    public void setDescriCur(String descriCur) {
        this.descriCur = descriCur;
    }
}