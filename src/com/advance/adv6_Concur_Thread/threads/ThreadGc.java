package com.advance.adv6_Concur_Thread.threads;

public class ThreadGc implements Runnable{
    @Override
    public void run() {
        System.gc();
        System.runFinalization();
        System.out.println("Garbage collector invoked");
    }
}
