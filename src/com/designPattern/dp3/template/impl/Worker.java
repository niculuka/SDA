package com.designPattern.dp3.template.impl;
public abstract class Worker {

    public final void printDailyRoutine() {
        getUp();
        eatBreakfast();
        goToWork();
        work();
        returnToHome();
        relax();
        sleep();
    }

    protected void getUp() {
        System.out.println("Get up my friend!");
    }

    protected void eatBreakfast() {
        System.out.println("It's breakfast!");
    }

    protected void goToWork() {
        System.out.println("Go to work at 8:00!");
    }

    protected abstract void work();

    protected void returnToHome() {
        System.out.println("Come home!");
    }

    protected void relax() {
        System.out.println("Go to relax!");
    }

    protected void sleep() {
        System.out.println("Go to sleep!");
    };
}
