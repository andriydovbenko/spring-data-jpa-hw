package com.cursor.demo.service;

import java.io.Serializable;
import java.util.List;

public interface CrudService<T, ID extends Serializable> {

    T getById(ID id);

    List<T> findAll();

    void save(T entity);
}