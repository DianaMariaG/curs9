package ro.fasttrackit.curs9.ex2;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Maria","Pop",
                LocalDateTime.of(1997,12,2,10,44),"Cluj",
                LocalDateTime.of(2010,5,6,14,55),"head of department");
        PersonHandler personhandler = new PersonHandler(employee1);
        printDetails(personhandler);

        DatabaseAdmin admin1 = new DatabaseAdmin("John","Lee",
                LocalDateTime.of(1985,5,7,10,15),"Hunedoara",
                LocalDateTime.of(2017,12,12,12,12),"administrator","SQL");
        personhandler.setPerson(admin1);
        printDetails(personhandler);

    }
    private static void printDetails(PersonHandler personhandler) {
        System.out.println("Person name is: " + personhandler.getFullName() + ". This person is " + personhandler.getAge()+ " years old.");
    }
}
