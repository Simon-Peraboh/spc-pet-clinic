package spc.guruspring5.services.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import spc.guruspring5.model.BaseEntity;


/**
 * spc 23/08/20
 * @param <T>
 * @param <ID>
 */
public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(T object){ // not sure what it return since t's generic

    if(object != null){
       if(object.getId() == null){
           object.setId(getNextId());
       }
       map.put(object.getId(), object);
    } else{
        throw new RuntimeException("Object Cannot be null");
    }
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }

    private Long getNextId(){

        Long nextId = null;
        try{
            nextId = Collections.max(map.keySet()) + 1;
        }catch(NoSuchElementException e) {
            nextId = 1L;
        }
        return nextId;
    }
}
