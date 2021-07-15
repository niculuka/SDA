package com.advance.adv3_BillPayment;

public class BanknoteEuro50 extends Banknote{


    public BanknoteEuro50(int receivedLength, int receivedWidth) {
        super(10, 5, receivedLength, receivedWidth);
    }

    @Override
    public int getValue() {
        return 50;
    }

    @Override
    public CurrencyType getCurrency() {
        return CurrencyType.EUR;
    }
}
