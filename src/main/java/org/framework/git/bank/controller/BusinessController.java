package org.framework.git.bank.controller;

import org.framework.git.bank.document.Business;
import org.framework.git.bank.service.GenericInterfaceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/business")
public class BusinessController implements GenericInterfaceController<Business> {

    private final GenericInterfaceService<Business> interfaceService;

    public BusinessController(GenericInterfaceService<Business> interfaceService) {
        this.interfaceService = interfaceService;
    }

    @GetMapping
    public ResponseEntity<List<Business>> findAll() {
        List<Business> list = interfaceService.findAll();
        return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Business>> findById(@PathVariable String id) {
        Optional<Business> item = interfaceService.findById(id);
        return new ResponseEntity<>(item, HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Business> save(@RequestBody Business business) {
        return new ResponseEntity<>(interfaceService.save(business), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Business> update(@RequestBody Business business) {
        return new ResponseEntity<>(interfaceService.update(business), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        interfaceService.delete(id);
    }
}
