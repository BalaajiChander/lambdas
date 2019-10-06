package org.bala.java.jee.lambdas.kowshik.exercise10;

/**
 *
 */
public class MethodReferenceExample {

    /**
     *
     */
    public MethodReferenceExample() {
    }

    public static void main(String[] args) {
        MethodReferenceExample methodReferenceExample = new MethodReferenceExample();
        Thread t = new Thread(methodReferenceExample::printMessage);
        t.start();
    }

    /**
     *
     */
    public void printMessage() {
        System.out.println(this.toString());
    }
}
