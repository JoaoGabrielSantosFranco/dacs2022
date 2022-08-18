package br.univille.apidacs2022.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.univille.apidacs2022.service.PacienteService;
import br.univille.coredacs2022.entity.Paciente;

@RestController
@RequestMapping("/api/v1/pacientes")
public class PacienteControllerAPI {

    @Autowired
    private PacienteService service;

    @GetMapping
    public ResponseEntity<List<Paciente>> getAll() {
        var listaPacientes = service.getAll();
        return new ResponseEntity<List<Paciente>>(listaPacientes, HttpStatus.OK);
    }

    public ResponseEntity<Paciente> insertPaciente(@RequestBody Paciente paciente) {
        service.save(paciente);
        return new ResponseEntity<Paciente>(paciente, HttpStatus.CREATED);
    }

    @GetMapping(value="/nome/{nome}")
    public ResponseEntity <List<Paciente>> getByNome(@PathVariable("nome")String nome) {
        var listaPacientes = service.getByName(nome);
        return new ResponseEntity<List<Paciente>>(listaPacientes,HttpStatus.OK);
    }
    
    @GetMapping()
    public ResponseEntity <List<Paciente>> getByNome2(@RequestParam("nome")String nome) {
        var listaPacientes = service.getByName(nome);
        return new ResponseEntity<List<Paciente>>(listaPacientes,HttpStatus.OK);
    }
    

}
