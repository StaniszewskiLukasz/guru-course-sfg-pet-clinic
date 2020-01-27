package guru.springframework.sfgpetclinic.model;

/**
 * @author Łukasz Staniszewski on 2020-01-27
 * @project sfg-pet-clinic
 */
public class Person {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
