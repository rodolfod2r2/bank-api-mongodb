package org.framework.git.bank.service;

import java.util.List;
import java.util.Optional;

public interface GenericInterfaceService<T> {

    List<T> findAll();

    Optional<T> findById(String id);

    T save(T t);

    T update(T t);

    void delete(String id);

}
