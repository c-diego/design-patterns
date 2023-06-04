package br.dev.diegocorte.designpatterns.factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

@DisplayName("Testing Design Pattern Factory")
public class FactoryTest {

    @Test
    @DisplayName("Testing TCPChannelFactory")
    public void testTCPChannel() {
        ChannelFactory factory = new TCPChannelFactory();
        Channel channel = factory.createChannel();
        assertInstanceOf(TCPChannel.class, channel);
    }

    @Test
    @DisplayName("Testing UDPChannelFactory")
    public void testUDPChannel() {
        ChannelFactory factory = new UDPChannelFactory();
        Channel channel = factory.createChannel();
        assertInstanceOf(UDPChannel.class, channel);
    }

}
