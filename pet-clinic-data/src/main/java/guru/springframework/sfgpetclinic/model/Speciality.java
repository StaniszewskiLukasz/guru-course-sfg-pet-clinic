package guru.springframework.sfgpetclinic.model;

/**
 * @author Łukasz Staniszewski on 2020-02-10
 * @project sfg-pet-clinic
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
