package org.bala.java.jee.lambdas.kowshik.exercise1.injava7;

public class Greeter {
    /**
     *
     */
    public Greeter() {
    }

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greet(new HelloWorldGreeting());
    }
}
