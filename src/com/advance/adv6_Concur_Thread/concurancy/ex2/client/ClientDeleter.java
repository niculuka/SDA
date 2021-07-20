package com.advance.adv6_Concur_Thread.concurancy.ex2.client;
import com.advance.adv6_Concur_Thread.concurancy.ex2.Main;
import java.util.Random;

public class ClientDeleter extends Thread{
    private static final Random RAND = new Random();

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(50);
                int indexToBeDeleted = RAND.nextInt(Main.PERSON_REPOSITORY.getSize()+1);
                Main.PERSON_REPOSITORY.deletePersonById(indexToBeDeleted);
                System.out.println("deleated" + indexToBeDeleted);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
