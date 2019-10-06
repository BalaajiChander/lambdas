package org.bala.java.jee.lambdas.kowshik.exercise11;

import org.bala.java.jee.lambdas.kowshik.exercise5.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ForEachExample {

    public static final List<Person> PERSONS = new ArrayList<>();

    /**
     *
     */
    public ForEachExample() {
        this.constructPerson();
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        new ForEachExample().printPersons(PERSONS);
    }

    private static void printPersons(List<Person> persons) {
        persons.forEach(System.out::println);
    }

    /**
     *
     */
    public void constructPerson() {
        PERSONS.add(new Person("Balaji", "Chander", "30"));
        PERSONS.add(new Person("Vignesh", "Chander", "29"));
        PERSONS.add(new Person("Karthick", "Chander", "32"));
        PERSONS.add(new Person("Ravi", "Chander", "62"));
    }


}
