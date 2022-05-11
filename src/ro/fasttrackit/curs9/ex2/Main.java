package ro.fasttrackit.curs9.ex2;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Maria","Fanca",LocalDateTime.of(1987,12,5,14,55),
                "Cluj",LocalDateTime.of(2010,12,4,4,3),"boss");
        PersonHandler personhandler = new PersonHandler(employee1);
        printDetails(personhandler);

        DatabaseAdmin admin1 = new DatabaseAdmin("John","Lee",
                LocalDateTime.of(1985,5,7,10,15),"Hunedoara",
                LocalDateTime.of(2017,12,12,12,12),"administrator","SQL");
        personhandler.setPerson(admin1);
        printDetails(personhandler);

    }
    private static void printDetails(PersonHandler personhandler) {
        System.out.println("Person's name is: " + personhandler.getFullName() + ". This person is " + personhandler.getAge()+ " years old.");
    }
}
