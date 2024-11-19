package pe.edu.upc.waba.serviceinterfaces;

import pe.edu.upc.waba.entities.ReservaAsesoria;

import java.util.List;

public interface IReservaAsesoriaService {
    public void insert(ReservaAsesoria reservaAsesoria);

    public void update(ReservaAsesoria u);

    public void delete(int id);

    public List<ReservaAsesoria> list();


    public ReservaAsesoria listId(int id);

    public List<String[]> cantidad();

    public List<String[]> turno();
}
