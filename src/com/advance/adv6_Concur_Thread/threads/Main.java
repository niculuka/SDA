package com.advance.adv6_Concur_Thread.threads;
/**
 * - Inherit a class from Thread and override the run( ) method.
 * - Inside run( ), print a message, and then call sleep( ).
 * - Repeat this three times, then return from run( ).
 * - Put a start-up message in the constructor.
 * - Make a separate thread class that calls System.gc( ) and System.runFinalization( ) inside run( ),
 *      printing a message as it does so.
 * - Make several thread objects of both types and run them to see what happens.
 * - Experiment with different sleep times to see what happens.
 */
public class Main {
    public static void main(String[] args) {
        ThreadA firstThread = new ThreadA("First thread");
        ThreadA secondThread = new ThreadA("Second Thread");
        firstThread.start();
        secondThread.start();

        Thread thirdThread = new Thread(new ThreadGc());
        Thread fourthThread = new Thread(new ThreadGc());
        thirdThread.start();
        fourthThread.start();
    }
}
