package spc.guruspring5.services.map;

import spc.guruspring5.model.Specialty;
import spc.guruspring5.services.SpecialtiesService;

import java.util.Set;

/**
 * spc 12/09/20
 */
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtiesService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
