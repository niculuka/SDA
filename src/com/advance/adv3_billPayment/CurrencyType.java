package com.advance.adv3_billPayment;

public enum CurrencyType {
    EUR("Euro"),
    USD("dollar"),
    RON("Leu");

    private String name;

    CurrencyType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
