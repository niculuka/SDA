package com.advance.adv6_Concur_Thread.concurancy.ex1;

import java.util.ArrayList;
import java.util.List;

/**
 * You are the manager. You have 5 employees.
 * Simulate the situation in which each of them comes at a different time to work.
 * - Every employee, after getting to work, displays the information "<name: I came to work at <time HH:MM>."
 * - Every 10 seconds, the employee displays „name: I'm still working!"
 *      c) Every 30 seconds, we release one of the employees to home (remember about stopping the thread!)
 *      and remove the employee from the „active employees list"
 * - When you release your employee to home, print „, it's time to go home!"
 * - *When you release a given employee, all of the others speed up. From that moment,
 *      display the information about work 2 seconds faster.
 *      f) ** The manager decides in which order release employees (e.g. through an earlier defined list)
 */
public class Main {
    private static final List<Employee> LIST_OF_EMPLOYEES = new ArrayList<Employee>();
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            LIST_OF_EMPLOYEES.add(new Employee("Employee" + i));
        }
        for (Employee e : LIST_OF_EMPLOYEES) {
            e.start();
        }

        for (Employee e : LIST_OF_EMPLOYEES) {
            try {
                Thread.sleep(30);
                e.stopEmployee();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }


}
