package com.advance.adv3_billPayment;

public class FakePayableException extends Exception{
    private PayableType payableType;

    public FakePayableException(PayableType payableType) {
        super("Payable type is fake!");
        this.payableType = payableType;
    }

    public PayableType getPayableType() {
        return payableType;
    }

}
