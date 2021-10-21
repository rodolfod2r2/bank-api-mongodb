package org.framework.git.bank.controller;

import org.framework.git.bank.document.Card;
import org.framework.git.bank.service.GenericInterfaceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/card")
public class CardController implements GenericInterfaceController<Card> {

    private final GenericInterfaceService<Card> interfaceService;

    public CardController(GenericInterfaceService<Card> interfaceService) {
        this.interfaceService = interfaceService;
    }

    @GetMapping
    public ResponseEntity<List<Card>> findAll() {
        List<Card> list = interfaceService.findAll();
        return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Card>> findById(@PathVariable String id) {
        Optional<Card> item = interfaceService.findById(id);
        return new ResponseEntity<>(item, HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Card> save(@RequestBody Card card) {
        return new ResponseEntity<>(interfaceService.save(card), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Card> update(@RequestBody Card card) {
        return new ResponseEntity<>(interfaceService.update(card), HttpStatus.CREATED);
    }


    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        interfaceService.delete(id);
    }
}
