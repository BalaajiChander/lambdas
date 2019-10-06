package org.bala.java.jee.lambdas.kowshik.exercise3.injava8;

public class RunnableExample {

    /**
     *
     */
    public RunnableExample() {
    }

    public static void main(String[] args) {
        Thread lambdaThread = new Thread(() -> System.out.println("inside lambda thread"));
        lambdaThread.run();
    }
}
