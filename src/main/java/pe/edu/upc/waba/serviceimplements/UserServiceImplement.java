package pe.edu.upc.waba.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.waba.entities.Users;
import pe.edu.upc.waba.repositories.IUserRepository;
import pe.edu.upc.waba.serviceinterfaces.IUserService;

import java.time.LocalDate;
import java.util.List;

@Service
public class UserServiceImplement implements IUserService {

    @Autowired
    private IUserRepository uR;


    @Override
    public void insert(Users usuario) {
        uR.save(usuario);
    }

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public Users listarId(int id) {
        return uR.findById(id).orElse(new Users());
    }

    @Override
    public List<String[]> hrxa() {
        return uR.hrxa();
    }

    @Override
    public int axrt(LocalDate startDate, LocalDate endDate) {
        return uR.axrt(startDate, endDate);
    }
}
