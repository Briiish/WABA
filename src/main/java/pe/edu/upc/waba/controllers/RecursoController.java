package pe.edu.upc.waba.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.waba.dtos.RecursoDTO;
import pe.edu.upc.waba.entities.Recurso;
import pe.edu.upc.waba.serviceinterfaces.IRecursoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recursos")
@SecurityRequirement(name = "javainuseapi")
public class RecursoController {
    @Autowired
    private IRecursoService rS;

    @GetMapping
    public List<RecursoDTO> listar(){
        return rS.list().stream().map(x->{
            ModelMapper m= new ModelMapper();
            return  m.map(x,RecursoDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void insertar(@RequestBody RecursoDTO dto){
        ModelMapper m=new ModelMapper();
        Recurso re=m.map(dto,Recurso.class);
        rS.insert(re);
    }
}
