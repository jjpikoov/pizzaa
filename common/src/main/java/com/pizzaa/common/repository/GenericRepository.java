package com.pizzaa.common.repository;

import java.util.List;

/**
 * Created by jjpikoov on 4/9/16.
 */
public interface GenericRepository<T> {
    void insert(T x);
    boolean delete(int id);
    T find(int id);
    List<T> findAll();
}
