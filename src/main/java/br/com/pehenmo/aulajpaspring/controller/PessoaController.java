package br.com.pehenmo.aulajpaspring.controller;

import br.com.pehenmo.aulajpaspring.model.Pessoa;
import br.com.pehenmo.aulajpaspring.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping(value= "/pessoa")
public class PessoaController {

    private final PessoaRepository dao;

    @Autowired
    public PessoaController(PessoaRepository dao) {
        this.dao = dao;
    }

    @GetMapping
    public ResponseEntity<?> listAll(){
        return new ResponseEntity<>(dao.findAll(), HttpStatus.OK);
    };

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getPessoaById(@PathVariable("id") Integer id){
        var pessoa = dao.findById(id).get();
        if(pessoa == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pessoa não encontrada!");
        return new ResponseEntity<>(pessoa, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Pessoa pessoa){
        return new ResponseEntity<>(dao.save(pessoa), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        dao.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Pessoa pessoa){
        dao.save(pessoa);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
