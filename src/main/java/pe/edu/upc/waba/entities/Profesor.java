package pe.edu.upc.waba.entities;

import jakarta.persistence.*;

@Entity
@Table(name="Profesor")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfe;
    @Column(name = "codProfe", length = 10, nullable = false)
    private String codProfe;
    @Column(name = "nombreProfe", length = 25, nullable = false)
    private String nombreProfe;
    @Column(name = "apellidoProfe", length = 50, nullable = false)
    private String apellidoProfe;
    @Column(name = "cursoProfe", length = 25, nullable = false)
    private String cursoProfe;
    @Column(name = "diaProfe", length = 10, nullable = false)
    private String diaProfe;
    @Column(name = "turnoProfe", length = 10, nullable = false)
    private String turnoProfe;

    public Profesor() {
    }

    public Profesor(int idProfe, String codProfe, String nombreProfe, String apellidoProfe, String cursoProfe, String diaProfe, String turnoProfe) {
        this.idProfe = idProfe;
        this.codProfe = codProfe;
        this.nombreProfe = nombreProfe;
        this.apellidoProfe = apellidoProfe;
        this.cursoProfe = cursoProfe;
        this.diaProfe = diaProfe;
        this.turnoProfe = turnoProfe;
    }

    public int getIdProfe() {
        return idProfe;
    }

    public void setIdProfe(int idProfe) {
        this.idProfe = idProfe;
    }

    public String getCodProfe() {
        return codProfe;
    }

    public void setCodProfe(String codProfe) {
        this.codProfe = codProfe;
    }

    public String getNombreProfe() {
        return nombreProfe;
    }

    public void setNombreProfe(String nombreProfe) {
        this.nombreProfe = nombreProfe;
    }

    public String getApellidoProfe() {
        return apellidoProfe;
    }

    public void setApellidoProfe(String apellidoProfe) {
        this.apellidoProfe = apellidoProfe;
    }

    public String getCursoProfe() {
        return cursoProfe;
    }

    public void setCursoProfe(String cursoProfe) {
        this.cursoProfe = cursoProfe;
    }

    public String getDiaProfe() {
        return diaProfe;
    }

    public void setDiaProfe(String diaProfe) {
        this.diaProfe = diaProfe;
    }

    public String getTurnoProfe() {
        return turnoProfe;
    }

    public void setTurnoProfe(String turnoProfe) {
        this.turnoProfe = turnoProfe;
    }
}
