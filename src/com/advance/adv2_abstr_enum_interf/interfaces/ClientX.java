package com.advance.adv2_abstr_enum_interf.interfaces;

import java.time.Instant;

public class ClientX implements ClientNotifier {

    @Override
    public void notifyClient(Instant currentDateTime) {
        System.out.println("Client X received current date and time" + currentDateTime);
    }
}
