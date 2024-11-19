package pe.edu.upc.waba.dtos;

import jakarta.persistence.Column;

public class ProfesorDTO {
    private int idProfe;
    private String codProfe;
    private String nombreProfe;
    private String apellidoProfe;
    private String cursoProfe;
    private String diaProfe;
    private String turnoProfe;

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
