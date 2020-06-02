package spc.guruspring5.services;

import spc.guruspring5.model.Pet;

import java.util.Set;
/**
 * spc 02-06-20
 */
public interface PetService {

    Pet findById(Long id);

    Pet save( Pet pet);

    Set<Pet> findAll();
}
