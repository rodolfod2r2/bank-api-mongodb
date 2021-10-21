package org.framework.git.bank.controller;

import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface GenericInterfaceController<T> {

    ResponseEntity<List<T>> findAll();

    ResponseEntity<Optional<T>> findById(String id);

    ResponseEntity<T> save(T t);

    ResponseEntity<T> update(T t);

    void delete(String id);

}
