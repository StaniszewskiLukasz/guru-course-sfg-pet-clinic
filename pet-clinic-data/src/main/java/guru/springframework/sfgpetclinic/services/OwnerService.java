package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * @author Łukasz Staniszewski on 2020-01-28
 * @project sfg-pet-clinic
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save (Owner owner);

    Set<Owner> findAll();
}
