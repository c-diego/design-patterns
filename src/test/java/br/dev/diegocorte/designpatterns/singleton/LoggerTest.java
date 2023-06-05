package br.dev.diegocorte.designpatterns.singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertSame;
@DisplayName("Testing Design Pattern Singleton")
public class LoggerTest {

    @Test
    @DisplayName("Testing getInstance() of Logger.class")
    public void testGetInstance() {
        Logger logA = Logger.getInstance();
        Logger logB = Logger.getInstance();
        assertSame(logA, logB);
    }

}
