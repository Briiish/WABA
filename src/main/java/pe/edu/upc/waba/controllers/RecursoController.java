package pe.edu.upc.waba.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.waba.dtos.QuerysDTO.RecursoQ1DTO;
import pe.edu.upc.waba.dtos.RecursoDTO;
import pe.edu.upc.waba.entities.Recurso;
import pe.edu.upc.waba.serviceinterfaces.IRecursoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/recursos")
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

    @GetMapping("/hrxp")
    public List<RecursoQ1DTO> hrxp(){
        List<String[]> filaLista = rS.hrxp();
        List<RecursoQ1DTO> dtoLista = new ArrayList<>();

        for (String[] columna : filaLista){
            RecursoQ1DTO dto = new RecursoQ1DTO();
            dto.setNombreProfesor(columna[0]);
            dto.setHorasReservadas(Double.parseDouble(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }
}
