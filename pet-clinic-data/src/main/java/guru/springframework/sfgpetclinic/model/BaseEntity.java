package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @author Łukasz Staniszewski on 2020-01-30
 * @project sfg-pet-clinic
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
