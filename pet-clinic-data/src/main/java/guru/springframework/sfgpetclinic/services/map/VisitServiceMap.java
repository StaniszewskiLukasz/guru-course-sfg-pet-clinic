package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author Łukasz Staniszewski on 2020-02-16
 * @project sfg-pet-clinic
 */
@Service
public class VisitServiceMap extends AbstractServiceMap<Visit,Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Visit findById(Long id) {
        return super.findByID(id);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() == null ||
                visit.getPet().getId() == null ||
                visit.getPet().getOwner() == null ||
                visit.getPet().getOwner().getId() == null ){
            throw new RuntimeException("Visit is invlid");
        }
        return super.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        super.delete(visit);
    }
}
