package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * @author Łukasz Staniszewski on 2020-01-28
 * @project sfg-pet-clinic
 */
public interface VetService {

    Vet findById(Long id);

    Vet save (Vet vet);

    Set<Vet> findAll();
}
