package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Łukasz Staniszewski on 2020-02-15
 * @project sfg-pet-clinic
 */
public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
