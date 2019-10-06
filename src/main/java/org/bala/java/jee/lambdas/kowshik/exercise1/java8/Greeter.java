package org.bala.java.jee.lambdas.kowshik.exercise1.java8;

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
        Greeting greeter1 = new Greeting(){
            @Override
            public void perform() {
                System.out.println("Inner Class  performa");
            }
        };
        greeter1.perform();
        greeter.greet(() -> System.out.println("Hello Lambdas"));
    }
}
