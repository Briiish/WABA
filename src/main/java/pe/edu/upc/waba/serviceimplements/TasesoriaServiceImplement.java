package pe.edu.upc.waba.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.waba.entities.Tasesoria;
import pe.edu.upc.waba.repositories.ITasesoriaRepository;
import pe.edu.upc.waba.serviceinterfaces.ITasesoriaService;

import java.util.List;

@Service
public class TasesoriaServiceImplement implements ITasesoriaService {


        @Autowired
        private ITasesoriaRepository taR;

        @Override
        public void insert(Tasesoria a) {
            taR.save(a);
        }

        @Override
        public void update(Tasesoria a) {
            taR.save(a);
        }

        @Override
        public void delete(int id) {
            taR.deleteById(id);
        }

        @Override
        public List<Tasesoria> list() {
            return taR.findAll();
        }

        @Override
        public Tasesoria listId(int id) {
            return taR.findById(id).orElse(null);
        }

}
