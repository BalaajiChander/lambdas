package org.bala.java.jee.lambdas.kowshik.exercise4;

public class Greeter {

    /**
     *
     */
    public Greeter() {
    }

    public static void main(String[] args) {
        Greeting greeting = () -> System.out.println("Functional Interface");
        greeting.greet();
    }
}
