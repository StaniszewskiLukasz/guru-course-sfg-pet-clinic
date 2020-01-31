package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.BaseEntity;
import guru.springframework.sfgpetclinic.model.Pet;

/**
 * @author Łukasz Staniszewski on 2020-01-28
 * @project sfg-pet-clinic
 */
public interface PetService<P extends BaseEntity, L extends Long> extends CrudService<Pet, Long> {

}
