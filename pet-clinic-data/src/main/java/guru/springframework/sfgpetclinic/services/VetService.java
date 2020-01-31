package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Person;
import guru.springframework.sfgpetclinic.model.Vet;

/**
 * @author Łukasz Staniszewski on 2020-01-28
 * @project sfg-pet-clinic
 */
public interface VetService<V extends Person, L extends Long> extends CrudService<Vet, Long> {

}
