package com.advance.adv6_Concur_Thread.threads;

public class ThreadA extends Thread {
    private String customMessage;

    public ThreadA(String customMessage) {
        this.customMessage = customMessage;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("This is Thread A");
                Thread.sleep(2000);
                System.out.println(customMessage);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
