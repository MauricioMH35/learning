package org.learning.crud.controllers;

import org.learning.crud.entities.Crud;
import org.learning.crud.repositories.CrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/crud")
public class CrudController {

    @Autowired
    private CrudRepository repository;
    
    @PostMapping
    public ResponseEntity<Crud> create(@RequestBody Crud crud) {
        try {
            repository.save(crud);
            return new ResponseEntity(crud, HttpStatus.CREATED);
        }
        catch(Exception e) {
            if(crud.equals(null))
                return new ResponseEntity(
                        "Não foi preenchido o objeto CRUD",
                        HttpStatus.NO_CONTENT);
            else
                return new ResponseEntity(
                        "Erro ao tentar efetuar a requisição",
                        HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<List<Crud>> get() {
        List<Crud> cruds = new ArrayList<>();
        
        try {
            cruds = repository.findAll();
            return new ResponseEntity(cruds, HttpStatus.OK);
        }
        catch(Exception e) {
            if(cruds.equals(null))
                return new ResponseEntity(
                        "Não foi encontrar o CRUDs",
                        HttpStatus.NO_CONTENT);
            else
                return new ResponseEntity(
                        "Erro ao tentar efetuar a requisição",
                        HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<List<Crud>> update(@PathVariable Long id, @RequestBody Crud crud) {
        try {
            Crud finded = repository.findById(id).get();
            if(!finded.equals(null))
                repository.save(crud);

            return new ResponseEntity(crud, HttpStatus.OK);
        }
        catch(Exception e) {
            if(crud.equals(null))
                return new ResponseEntity(
                        "Os dados do objeto não foram passados para realizar a alteração",
                        HttpStatus.NO_CONTENT);
            else
                return new ResponseEntity(
                        "Erro ao tentar efetuar a requisição",
                        HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Crud> delete(@PathVariable Long id) {
        try {
            repository.deleteById(id);

            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        catch(Exception e) {
            if(!repository.findById(id).equals(null))
                return new ResponseEntity(
                        "Não foi remover o objeto, pois não foi encontrado",
                        HttpStatus.FOUND);
            else
                return new ResponseEntity(
                        "Erro ao tentar efetuar a requisição",
                        HttpStatus.BAD_REQUEST);
        }
    }
}
