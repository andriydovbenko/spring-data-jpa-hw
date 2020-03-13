package com.cursor.demo.service.impl;

import com.cursor.demo.service.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;
import java.util.List;

public class CrudServiceImpl<T, ID extends Serializable> implements CrudService<T, ID> {

    private final JpaRepository<T, ID> repository;

    public CrudServiceImpl(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T getById(ID id) {
        return repository.getOne(id);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(T entity) {
        repository.save(entity);
    }
}