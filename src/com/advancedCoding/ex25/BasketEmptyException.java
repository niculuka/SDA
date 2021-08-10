package com.advancedCoding.ex25;

public class BasketEmptyException extends  Exception{
    public BasketEmptyException() {
        super("No more items");
    }


}
