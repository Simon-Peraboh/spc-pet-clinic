package spc.guruspring5.repositories;

import org.springframework.data.repository.CrudRepository;
import spc.guruspring5.model.Pet;

/**
 * spc 18/9/20
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
