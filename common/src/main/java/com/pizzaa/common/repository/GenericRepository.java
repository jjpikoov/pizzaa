package com.pizzaa.common.repository;

import java.util.ArrayList;

/**
 * Created by jjpikoov on 4/9/16.
 */
public interface GenericRepository<T> {
    void insert(T x);
    T delete(int id);
    T find(int id);
    ArrayList<T> findAll();
}