package guru.springframework.sfgpetclinic.services.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Łukasz Staniszewski on 2020-01-30
 * @project sfg-pet-clinic
 */
public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    T findByID(ID id) {
        return map.get(id);
    }

    T save(ID id, T object) {
        map.put(id, object);
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void deleteByObject(T object){
//        for (int i = 0; i < map.size(); i++) { // to moje przestarzałe rozwiązanie
//            if(map.get(i).equals(object)){
//                map.remove(i);
//            }
//        }
        map.entrySet().removeIf(e->e.getValue().equals(object));
    }


}
