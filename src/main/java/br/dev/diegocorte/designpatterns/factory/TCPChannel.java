package br.dev.diegocorte.designpatterns.factory;

public class TCPChannel implements Channel {

    @Override
    public void connect() {
        System.out.println("TCP channel connected.");
    }

}
