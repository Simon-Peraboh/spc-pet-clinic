package spc.guruspring5.services.map;

import org.springframework.stereotype.Service;
import spc.guruspring5.model.PetType;
import spc.guruspring5.services.PetTypeService;

import java.util.Set;

/**
 * spc 10/9/20
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Long> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
