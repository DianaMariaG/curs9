package ro.fasttrackit.curs9.ex2;

import java.time.LocalDateTime;

public class Programmer extends Employee{

    private String language;

    public Programmer(String fn, String ln, LocalDateTime bday, String add, LocalDateTime employ, String pos, String lang) {
        super(fn, ln, bday, add, employ, pos);
        this.language = lang;
    }

    public String getLanguage() {
        return this.language;
    }

    @Override
    public String getPosition() {
        return "programmer";
    }
}
