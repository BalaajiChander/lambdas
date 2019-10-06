package org.bala.java.jee.lambdas.kowshik.exercise6;

import org.bala.java.jee.lambdas.kowshik.exercise5.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 1. sort list by last name;
 * 2. create a method that prints all elements in the list
 * 3. create a method that prints all elements with last name starting with C
 * <p>
 * USING PREDICATES AND CONSUMER
 */
public class FunctionalInterfaceExamples {
    public static final List<Person> PERSONS = new ArrayList<>();

    /**
     *
     */
    public FunctionalInterfaceExamples() {
        PERSONS.add(new Person("Balaji", "Chander", "30"));
        PERSONS.add(new Person("Vignesh", "Chander", "29"));
        PERSONS.add(new Person("Karthick", "Chander", "32"));
        PERSONS.add(new Person("Ravi", "Chander", "62"));
    }

    public static void main(String[] args) {
        FunctionalInterfaceExamples fe = new FunctionalInterfaceExamples();
        // sort by last name
        System.out.println("// sorting ....  \n");
        PERSONS.stream().sorted(Comparator.comparing(Person::getFirstName)).collect(Collectors.toList());
        System.out.println("\n");
        // Print persons
        System.out.println("PERSONS LIST\n");

        fe.performConditionally(PERSONS, p -> true, p -> System.out.println(p.toString()));
        System.out.println("\n");
        System.out.println("PERSONS LIST STARTS WITH R \n");
        // first name starts with R
        fe.performConditionally(PERSONS, p -> p.getFirstName().startsWith("R"), p -> System.out.println(p.toString()));
        System.out.println("\n");

    }

    public void performConditionally(List<Person> persons, Predicate<Person> personPredicate, Consumer<Person> personConsumer) {
        persons.stream().filter(p -> personPredicate.test(p)).collect(Collectors.toList()).forEach(p -> {
            personConsumer.accept(p);
        });
    }
}
