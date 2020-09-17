package spc.guruspring5.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * spc 21/5/20
 */
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }



}
