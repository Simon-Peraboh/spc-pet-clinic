package spc.guruspring5.services;

import spc.guruspring5.model.Owner;


/**
 * spc 02-06-20
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName( String lastName);


}
