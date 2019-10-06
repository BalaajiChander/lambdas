package org.bala.java.jee.lambdas.kowshik.exercise8;

/**
 *
 */
public class LambdaClosure {

    /**
     *
     */
    public LambdaClosure() {
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        LambdaClosure lambdaClosure = new LambdaClosure();
        lambdaClosure.doProcess(10, i -> System.out.println(i + 40));
    }

    /**
     * @param i
     * @param process
     */
    public void doProcess(int i, Process process) {
        process.process(i);
    }
}
