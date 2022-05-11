package ro.fasttrackit.curs9.ex2;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

import static java.time.LocalDateTime.now;
import static java.time.temporal.ChronoUnit.YEARS;

public class Employee implements Person {
    private String firstName;
    private String lastName;
    private LocalDateTime birthday;
    private String address;
    private LocalDateTime dateOfEmployment;
    private String position;

    public Employee(String fn, String ln, LocalDateTime bday, String add, LocalDateTime dateEmploy, String pos) {
        this.dateOfEmployment = dateEmploy;
        this.position = (pos != null && !"".equals(pos.trim()) ? pos : "n/a";
        this.birthday = (bday != null && bday.isAfter(now()))
                ? now().minus(18, YEARS)
                : bday;
        this.firstName = fn;
        this.lastName = ln;
        this.address = add;
    }

    public LocalDateTime getDateOfEmployment() {
        return this.dateOfEmployment;
    }

    public String getPosition() {
        return this.position;
    }

    @Override
    public String getFirstName() {
        return this.firstName;
    }

    @Override
    public String getLastName() {
        return this.lastName;
    }

    @Override
    public LocalDateTime getBirthday() {
        return this.birthday;
    }

    @Override
    public String getAddress() {
        return this.address;
    }
}
