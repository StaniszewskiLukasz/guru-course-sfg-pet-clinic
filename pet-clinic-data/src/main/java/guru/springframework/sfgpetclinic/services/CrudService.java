package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * @author Łukasz Staniszewski on 2020-01-30
 * @project sfg-pet-clinic
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);
}
