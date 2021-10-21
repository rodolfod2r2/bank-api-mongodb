package org.framework.git.bank.controller;

import org.framework.git.bank.document.Account;
import org.framework.git.bank.service.GenericInterfaceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/account")
public class AccountController implements GenericInterfaceController<Account> {

    private final GenericInterfaceService<Account> interfaceService;

    public AccountController(GenericInterfaceService<Account> interfaceService) {
        this.interfaceService = interfaceService;
    }

    @GetMapping
    public ResponseEntity<List<Account>> findAll() {
        List<Account> list = interfaceService.findAll();
        return new ResponseEntity<>(list, HttpStatus.ACCEPTED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Account>> findById(@PathVariable String id) {
        Optional<Account> item = interfaceService.findById(id);
        return new ResponseEntity<>(item, HttpStatus.ACCEPTED);
    }

    @PostMapping
    public ResponseEntity<Account> save(@RequestBody Account account) {
        return new ResponseEntity<>(interfaceService.save(account), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Account> update(@RequestBody Account account) {
        return new ResponseEntity<>(interfaceService.update(account), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        interfaceService.delete(id);
    }
}
