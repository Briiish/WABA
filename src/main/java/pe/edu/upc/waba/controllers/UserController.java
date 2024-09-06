package pe.edu.upc.waba.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.waba.dtos.QuerysDTO.Q3hrxaDTO;
import pe.edu.upc.waba.dtos.QuerysDTO.Q4axrtDTO;
import pe.edu.upc.waba.dtos.UserDTO;
import pe.edu.upc.waba.entities.Users;
import pe.edu.upc.waba.serviceinterfaces.IUserService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UserController {
    @Autowired
    private IUserService uS;

    @PostMapping
    public void registrar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        uS.insert(u);
    }

    @PutMapping
    public void modificar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        uS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id) {
        uS.delete(id);
    }

    @GetMapping("/{id}")
    public UserDTO listarId(@PathVariable("id") int id) {
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(uS.listarId(id), UserDTO.class);
        return dto;
    }

    @GetMapping
    public List<UserDTO> listar() {
        return uS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/hrxa")
    public List<Q3hrxaDTO> hrxa() {
        List<String[]> filaLista = uS.hrxa();
        List<Q3hrxaDTO> dtoLista = new ArrayList<>();
        for (String[] columna : filaLista) {
            Q3hrxaDTO dto = new Q3hrxaDTO();
            dto.setNombreUser(columna[0]);
            dto.setHorasReservadas(Double.parseDouble(columna[1]));
            dtoLista.add(dto);
        }
        return dtoLista;
    }

    @GetMapping("/axrt")
    public Q4axrtDTO axrt(
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {
        int userCount = uS.axrt(startDate,endDate);
        return new Q4axrtDTO(userCount);
    }

}
