package org.bala.java.jee.lambdas.kowshik.exercise9;

import org.bala.java.jee.lambdas.kowshik.exercise8.Process;

/**
 *
 */
public class ThisReferenceExample {


    /**
     *
     */
    public ThisReferenceExample() {
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("I : " + i);
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "$classname{}";
            }
        });

        thisReferenceExample.doProcess(20, i -> {
            System.out.println("ilambda " + i);
            // System.out.println(this);
        });

        thisReferenceExample.doExecute();

    }

    @Override
    public String toString() {
        return "this is the instance of ThisReferenceExample";
    }

    /**
     *
     */
    public void doExecute() {
        this.doProcess(25, i -> {
            System.out.println("I : " + i);
            System.out.println(this);
        });
    }

    /**
     * @param i
     * @param p
     */
    public void doProcess(int i, Process p) {
        p.process(i);
    }
}
