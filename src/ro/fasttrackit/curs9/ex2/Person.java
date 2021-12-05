package ro.fasttrackit.curs9.ex2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Person {
    protected String firstName;
    protected String lastName;
    protected LocalDateTime birthday;
    protected String address;

    public Person(String fn, String ln, LocalDateTime bday, String add) {
        this.firstName = fn;
        this.lastName = ln;
        this.birthday = bday;
        this.address = add;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public LocalDateTime getBirthday() {
        return this.birthday;
    }
    public String getAddress() {
        return this.address;
    }
}
