package spc.guruspring5.repositories;

import org.springframework.data.repository.CrudRepository;
import spc.guruspring5.model.PetType;

/**
 * spc 18/9/20
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
