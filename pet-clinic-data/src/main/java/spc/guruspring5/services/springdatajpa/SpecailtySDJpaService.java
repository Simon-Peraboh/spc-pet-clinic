package spc.guruspring5.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import spc.guruspring5.model.Specialty;
import spc.guruspring5.repositories.SpecialtyRepository;
import spc.guruspring5.services.SpecialtyService;

import java.util.HashSet;
import java.util.Set;

/**
 * spc 12/01/21
 */
@Service
@Profile("springdatajpa")
public class SpecailtySDJpaService implements SpecialtyService {
    private final SpecialtyRepository specialtyRepository;

    public SpecailtySDJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        specialtyRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Specialty findById(Long aLong) {
        return specialtyRepository.findById(aLong).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepository.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        specialtyRepository.deleteById(aLong);

    }
}
