package spc.guruspring5.services;

import spc.guruspring5.model.Owner;

import java.util.Set;

/**
 * spc 02-06-20
 */
public interface OwnerService {

    Owner findByLastName( String lastName);

    Owner findById(Long id);

    Owner save( Owner owner);

    Set<Owner> findAll();
}
