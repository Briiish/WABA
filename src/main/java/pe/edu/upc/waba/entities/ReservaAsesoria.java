package pe.edu.upc.waba.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "ReservaAsesoria")
public class ReservaAsesoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRes;

    @Column(name = "fechaRes", nullable = false)
    private LocalDate fechaRes;

    @Column(name = "hInicioRes", nullable = false)
    private LocalTime hInicioRes;

    @Column(name = "hFinRes", nullable = false)
    private LocalTime hFinRes;

    @Column(name = "viaRes", length = 50, nullable = false)
    private String viaRes;

    @ManyToOne
    @JoinColumn(name = "idProfe", nullable = false)
    private Profesor Pro;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Users Us;

//    @ManyToOne
//    @JoinColumn(name = "Tasesoria_idAs", nullable = false)
//    private Asesoria tasesoria;

    @ManyToOne
    @JoinColumn(name = "idMo", nullable = false)
    private Modalidad Mo;


    public ReservaAsesoria() {
    }


    public ReservaAsesoria(int idRes, LocalDate fechaRes, LocalTime hInicioRes, LocalTime hFinRes, String viaRes,
                           Profesor Pro, Users Us, Modalidad Mo) {
        this.idRes = idRes;
        this.fechaRes = fechaRes;
        this.hInicioRes = hInicioRes;
        this.hFinRes = hFinRes;
        this.viaRes = viaRes;
        this.Pro = Pro;
        this.Us = Us;
//        this.tasesoria = tasesoria;
        this.Mo = Mo;
    }

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
}
