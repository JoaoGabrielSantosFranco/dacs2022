package br.univille.apidacs2022.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.apidacs2022.service.CidadeService;
import br.univille.coredacs2022.entity.Cidade;
import io.swagger.models.Response;

@RestController
@RequestMapping("/api/v1/cidades")
public class CidadeControllerAPI {
    
    @Autowired
    private CidadeService service;

    @GetMapping
    public ResponseEntity<List<Cidade>> getAll() {
        var listaCidade = service.getAll();
        return new ResponseEntity<List<Cidade>>(listaCidade, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cidade> getByid(@PathVariable("id") long id ){
        var cidade = service.findById(id);
        return new ResponseEntity<Cidade>(cidade,HttpStatus.OK);

    }



}