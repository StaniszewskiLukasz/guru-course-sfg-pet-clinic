package guru.springframework.sfgpetclinic.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Łukasz Staniszewski on 2020-01-27
 * @project sfg-pet-clinic
 */
@Entity
@Table(name = "vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "vet_specialities",
            joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns =@JoinColumn(name = "speciality_id") )
    private Set<Speciality> specialties = new HashSet<>();

    public Set<Speciality> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Speciality> specialties) {
        this.specialties = specialties;
    }
}
