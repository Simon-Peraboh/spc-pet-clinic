package spc.guruspring5.model;

import java.io.Serializable;

/**
 * spc 02-06-20
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
