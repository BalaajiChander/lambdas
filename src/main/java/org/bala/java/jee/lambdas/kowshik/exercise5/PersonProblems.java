package org.bala.java.jee.lambdas.kowshik.exercise5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1. sort list by last name;
 * 2. create a method that prints all elements in the list
 * 3. create a method that prints all elements with last name starting with C
 */
public class PersonProblems {
    public static final List<Person> PERSONS = new ArrayList<>();

    /**
     * populate persons
     */
    public PersonProblems() {
        this.constructPerson();
    }

    public static void main(String[] args) {
        PersonProblems p = new PersonProblems();
        System.out.println("// Persons ");
        p.printPersons(PERSONS);

        System.out.println("// Sorted list of persons by firstName ");
        p.printPersons(p.getSortedPersons(PERSONS, Comparator.comparing(person -> person.getFirstName())));

        System.out.println("// Person whose last name starts with C ");
        p.printPersons(p.getPersonsConditionally(PERSONS));
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

    /**
     * @param persons
     * @param comparing
     * @return
     */
    public List<Person> getSortedPersons(List<Person> persons, Comparator<Person> comparing) {
        return persons.stream().sorted(comparing).collect(Collectors.toList());
    }

    /**
     * @param persons
     * @return
     */
    public List<Person> getPersonsConditionally(List<Person> persons) {
        return persons.stream().filter(person -> person.getLastName().startsWith("C")).collect(Collectors.toList());
    }

    /**
     * @param persons
     */
    public void printPersons(List<Person> persons) {
        persons.forEach(each -> System.out.println(each.toString()));
    }


}
