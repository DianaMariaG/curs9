package ro.fasttrackit.curs9.ex2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public interface Person {

     String getFirstName();
    public String getLastName();
    public LocalDateTime getBirthday();
    public String getAddress();
}
