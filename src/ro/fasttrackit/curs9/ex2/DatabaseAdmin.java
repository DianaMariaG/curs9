package ro.fasttrackit.curs9.ex2;

import java.time.LocalDateTime;

public class DatabaseAdmin extends Employee{
    private String dbTechnology;

    public DatabaseAdmin(String fn, String ln, LocalDateTime bday, String add, LocalDateTime employ, String pos, String dbTech) {
        super(fn, ln, bday, add, employ, pos);
        this.dbTechnology = dbTech;
    }

    public String getDbTechnology() {
        return this.dbTechnology;
    }

    @Override
    public String getAddress() {
        return "db admin " + super.getAddress();
    }
}
