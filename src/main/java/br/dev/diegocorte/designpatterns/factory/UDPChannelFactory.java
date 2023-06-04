package br.dev.diegocorte.designpatterns.factory;

public class UDPChannelFactory implements ChannelFactory {

    @Override
    public Channel createChannel() {
        return new UDPChannel();
    }

}
