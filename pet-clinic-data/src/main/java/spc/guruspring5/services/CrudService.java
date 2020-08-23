package spc.guruspring5.services;

import java.util.Set;

/**
 * spc 23/8/20
 */
public interface CrudService <T, ID>  {

    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
