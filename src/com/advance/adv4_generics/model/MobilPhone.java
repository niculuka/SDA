package com.advance.adv4.model;

public class MobilPhone implements Identifiable {
    private String IMEI;
    private String brand;

    @Override
    public String getId() {
        return IMEI;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
