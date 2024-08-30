package pe.edu.upc.waba.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.waba.dtos.ProfesorDTO;
import pe.edu.upc.waba.entities.Profesor;
import pe.edu.upc.waba.serviceinterfaces.IProfesorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {
    @Autowired
    private IProfesorService pS;

    @GetMapping
    public List<ProfesorDTO> list(){
        return pS.list().stream().map(y->{
            ModelMapper m= new ModelMapper();
            return m.map(y, ProfesorDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void Insert(@RequestBody ProfesorDTO dto){
        ModelMapper m = new ModelMapper();
        Profesor p = m.map(dto, Profesor.class);
        pS.insert(p);
    }

    @GetMapping("/{id}")
    public ProfesorDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ProfesorDTO dto =m.map(pS.ListId(id),ProfesorDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ProfesorDTO dto){
        ModelMapper m = new ModelMapper();
        Profesor pr = m.map(dto, Profesor.class);
        pS.update(pr);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pS.delete(id);
    }
}
