package org.framework.git.bank.controller;

import org.framework.git.bank.document.Person;
import org.framework.git.bank.service.GenericInterfaceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/person")
public class PersonController implements GenericInterfaceController<Person> {

    private final GenericInterfaceService<Person> interfaceService;

    public PersonController(GenericInterfaceService<Person> interfaceService) {
        this.interfaceService = interfaceService;
    }

    @GetMapping
    public ResponseEntity<List<Person>> findAll() {
        List<Person> list = interfaceService.findAll();
        return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Person>> findById(@PathVariable String id) {
        Optional<Person> item = interfaceService.findById(id);
        return new ResponseEntity<>(item, HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Person> save(@RequestBody Person person) {
        return new ResponseEntity<>(interfaceService.save(person), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Person> update(@RequestBody Person person) {
        return new ResponseEntity<>(interfaceService.update(person), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        interfaceService.delete(id);
    }
}
