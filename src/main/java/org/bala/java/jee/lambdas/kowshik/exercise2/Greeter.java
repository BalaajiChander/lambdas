package org.bala.java.jee.lambdas.kowshik.exercise2;

public class Greeter {

    /**
     *
     */
    public Greeter() {
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        TypeInterface typeInterface = s -> s.length();
        System.out.println(typeInterface.getLength("Balaaji Chander"));
    }
}
