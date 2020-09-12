package spc.guruspring5.model;

import java.util.HashSet;
import java.util.Set;

/**
 * spc 21/5/20
 */
public class Vet extends Person {

    private Set<Specialty> specialties = new HashSet<>();

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
