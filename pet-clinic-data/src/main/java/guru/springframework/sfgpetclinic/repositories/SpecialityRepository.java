package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Łukasz Staniszewski on 2020-02-15
 * @project sfg-pet-clinic
 */
public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
