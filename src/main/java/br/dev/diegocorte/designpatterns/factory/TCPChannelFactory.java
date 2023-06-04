package br.dev.diegocorte.designpatterns.factory;

public class TCPChannelFactory implements ChannelFactory {

    @Override
    public Channel createChannel() {
        return new TCPChannel();
    }

}
