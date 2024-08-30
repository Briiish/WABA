package pe.edu.upc.waba.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.waba.dtos.ModalidadDTO;
import pe.edu.upc.waba.entities.Modalidad;
import pe.edu.upc.waba.serviceinterfaces.IModalidadService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/modalidades")
public class ModalidadController {
    @Autowired
    private IModalidadService mS;

    @GetMapping
    public List<ModalidadDTO> list(){
        return mS.list().stream().map(y->{
            ModelMapper m= new ModelMapper();
            return m.map(y,ModalidadDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public void Insert(@RequestBody ModalidadDTO dto){
        ModelMapper m= new ModelMapper();
        Modalidad mo = m.map(dto, Modalidad.class);
        mS.insert(mo);
    }

    @GetMapping("/{id}")
    public ModalidadDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m= new ModelMapper();
        ModalidadDTO dto=m.map(mS.ListId(id), ModalidadDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ModalidadDTO dto){
        ModelMapper m= new ModelMapper();
        Modalidad mo=m.map(dto, Modalidad.class);
        mS.update(mo);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){ mS.delete(id);}

    @GetMapping("/busquedas")
    public List<ModalidadDTO> buscarModalidades(@RequestParam String modalidad){
        return mS.buscarModalidad(modalidad).stream().map(x->{
            ModelMapper m= new ModelMapper();
            return m.map(x, ModalidadDTO.class);
        }).collect(Collectors.toList());
    }
}
