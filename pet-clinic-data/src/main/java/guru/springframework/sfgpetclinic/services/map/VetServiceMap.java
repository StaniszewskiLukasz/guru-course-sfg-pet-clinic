package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Łukasz Staniszewski on 2020-01-31
 * @project sfg-pet-clinic
 */
@Service
@Profile({"default","map"})
public class VetServiceMap extends AbstractServiceMap<Vet,Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }


    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
super.delete(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialties().size()>0){
            object.getSpecialties().forEach(speciality -> {
                if(speciality.getId()==null){
                  Speciality savedSpeciality = specialityService.save(speciality);
                  speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(object);
    }
}
