package br.dev.diegocorte.designpatterns.factory;

public class UDPChannel implements Channel {

    @Override
    public void connect() {
        System.out.println("UDP channel connected.");
    }

}
