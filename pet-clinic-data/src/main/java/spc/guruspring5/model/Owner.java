package spc.guruspring5.model;

import java.util.Set;

/**
 * spc 21/5/20
 */
public class Owner extends Person {
    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
