package guru.springframework.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Łukasz Staniszewski on 2020-02-10
 * @project sfg-pet-clinic
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {

    @Column(name = "description")
    private String description;

//    @ManyToMany(mappedBy = "vet")
//    private Set<Vet> vets= new HashSet<>();
}
