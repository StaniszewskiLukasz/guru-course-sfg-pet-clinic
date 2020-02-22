package guru.springframework.sfgpetclinic.services.sprigndatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * @author Łukasz Staniszewski on 2020-02-22
 * @project sfg-pet-clinic
 */
@ExtendWith(MockitoExtension.class)
class OwnerSDJpaServiceTest {

    public static final String LAST_NAME = "Kowalski";
    final Long ownerId = 1L;
    Owner testOwner;

    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository petTypeRepository;
    @InjectMocks
    OwnerSDJpaService service;

    @BeforeEach
    void setUp() {
        testOwner = Owner.builder().id(ownerId).lastName(LAST_NAME).build();
    }

    @Test
    void findByLastName() {
        List<Owner> returnList = new ArrayList<>();
        returnList.add(testOwner);
        when(ownerRepository.findByLastName(any())).thenReturn(returnList);
        List<Owner> kowalski = service.findByLastName(LAST_NAME);
        for (Owner owner : kowalski)
            assertEquals(LAST_NAME, owner.getLastName());
    }

    @Test
    void findAll() {
        Set<Owner> ownersSet = new HashSet<>();
        ownersSet.add(testOwner);
        ownersSet.add(Owner.builder().id(2L).build());
        ownersSet.add(Owner.builder().id(3L).build());
        when(ownerRepository.findAll()).thenReturn(ownersSet);
        Set<Owner> owners = service.findAll();
        assertNotNull(owners);
        assertEquals(3, owners.size());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(ownerId)).thenReturn(Optional.of(testOwner));
        Owner owner = service.findById(ownerId);
        assertEquals(testOwner.getId(), owner.getId());
    }

    @Test
    void save() {
        Owner ownerToSave = Owner.builder().id(1L).build();
        when(ownerRepository.save(any())).thenReturn(testOwner);
        Owner savedOwner = service.save(ownerToSave);
        assertNotNull(savedOwner);
    }

    @Test
    void delete() {
    service.delete(testOwner);
    verify(ownerRepository).delete(any());

    }

    @Test
    void deleteById() {
        service.deleteById(ownerId);
        verify(ownerRepository).deleteById(anyLong());
    }
}