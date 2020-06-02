package spc.guruspring5.services;

import spc.guruspring5.model.Vet;

import java.util.Set;
/**
 * spc 02-06-20
 */
public interface VetService {

    Vet findById(Long id);

    Vet save( Vet vet);

    Set<Vet> findAll();
}
