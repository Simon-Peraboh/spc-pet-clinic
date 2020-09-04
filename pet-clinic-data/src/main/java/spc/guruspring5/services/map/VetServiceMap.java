package spc.guruspring5.services.map;

import org.springframework.stereotype.Service;
import spc.guruspring5.model.Vet;
import spc.guruspring5.services.VetService;

import java.util.Set;

/**
 * spc 23/8/20
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
