package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * @author Łukasz Staniszewski on 2020-01-27
 * @project sfg-pet-clinic
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
