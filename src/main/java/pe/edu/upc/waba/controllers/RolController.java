package pe.edu.upc.waba.controllers;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.waba.dtos.RolDTO;
import pe.edu.upc.waba.entities.Rol;
import pe.edu.upc.waba.serviceinterfaces.IRolService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
@SecurityRequirement(name = "javainuseapi")
public class RolController {
    @Autowired
    private IRolService rS;

    @GetMapping
    public List<RolDTO> list(){
        return rS.list().stream().map(y->{
            ModelMapper m= new ModelMapper();
            return m.map(y, RolDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void Insertar(@RequestBody RolDTO dto){
        ModelMapper m = new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.insert(r);
    }

    @GetMapping("/{id}")
    public RolDTO ListarId(@PathVariable("id") Integer id){
        ModelMapper m= new ModelMapper();
        RolDTO dto=m.map(rS.listarId(id), RolDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody RolDTO dto){
        ModelMapper m = new ModelMapper();
        Rol r = m.map(dto, Rol.class);
        rS.update(r);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rS.delete(id);
    }
}
