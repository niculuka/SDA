package com.advance.adv2_abstr_enum_interf.interfaces;

/** Suppose you have written a time server that periodically notifies its clients of the current date and time.
 Write an interface the server could use to enforce a particular protocol on its clients.
 */

public class Main {
    public static void main(String[] args) {

        ClientNotifier[] clients = new ClientNotifier[2];

        clients[0] = new ClientX();
        clients[1] = new ClientX();

        Server server = new Server(clients);
        server.notifyAllClients();
        server.notifyAllClients();

    }
}
