package org.bala.java.jee.lambdas.kowshik.exercise7;

import org.bala.java.jee.lambdas.kowshik.exercise5.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ExceptionHandling {

    public static final List<Person> PERSONS = new ArrayList<>();

    /**
     * Auto generated default constructor stub
     */
    public ExceptionHandling() {
        this.constructPerson();
    }

    public static void main(String[] args) {
        PERSONS.forEach(person -> {
            // exception handling
            try {
                System.out.println(person.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });

    }

    public void constructPerson() {
        PERSONS.add(new Person("Balaji", "Chander", "30"));
        PERSONS.add(new Person("Vignesh", "Chander", "29"));
        PERSONS.add(new Person("Karthick", "Chander", "32"));
        PERSONS.add(new Person("Ravi", "Chander", "62"));
    }
}
