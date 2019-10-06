package org.bala.java.jee.lambdas.kowshik.exercise3.injava4;

public class RunnableExample {

    /**
     *
     */
    public RunnableExample() {
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("inside my thread");
            }
        });
        myThread.run();
    }
}
