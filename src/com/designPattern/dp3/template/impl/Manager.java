package com.designPattern.dp3.template.impl;
public class Manager extends Worker{
    @Override
    protected void work() {
        System.out.println("- - - Manager works - - -");
    }
    @Override
    protected void relax() {
        System.out.println("- - - Manager relaxes - - -");

    }

}
