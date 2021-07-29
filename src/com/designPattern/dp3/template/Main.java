package com.designPattern.dp3.template;
import com.designPattern.dp3.template.impl.Firefighter;
import com.designPattern.dp3.template.impl.Manager;
import com.designPattern.dp3.template.impl.Postman;
import com.designPattern.dp3.template.impl.Worker;

public class Main {
    public static void main(String[] args) {

        Worker postman = new Postman();
        Worker firefighter = new Firefighter();
        Worker manager = new Manager();

        postman.printDailyRoutine();
        System.out.println("=================================");

        firefighter.printDailyRoutine();
        System.out.println("=================================");

        manager.printDailyRoutine();
        System.out.println("=================================");
    }
}
