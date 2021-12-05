package ro.fasttrackit.curs9.ex2;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class PersonHandler {
    private Person person;

    public PersonHandler(Person person) {
        this.person = person;
    }

    public String getFullName() {
        return person.getFirstName() + " " + person.getLastName();
    }

    public int getAge() {
        LocalDateTime birthday = person.getBirthday();
        LocalDateTime now = LocalDateTime.now();
        int years = (int)birthday.until(now, ChronoUnit.YEARS);
        return years;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
