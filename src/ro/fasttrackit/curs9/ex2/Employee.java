package ro.fasttrackit.curs9.ex2;

import java.time.LocalDateTime;

public class Employee extends Person{
    protected LocalDateTime dateOfEmployment;
    protected String position;

    public Employee(String fn, String ln, LocalDateTime bday, String add, LocalDateTime employ, String pos) {
        super(fn, ln, bday, add);
        this.dateOfEmployment = employ;
        this.position = pos;
    }

    public LocalDateTime getDateOfEmployment() {
        return this.dateOfEmployment;
    }
    public String getPosition() {
        return this.position;
    }
}
