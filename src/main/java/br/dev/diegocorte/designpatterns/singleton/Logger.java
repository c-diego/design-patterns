package br.dev.diegocorte.designpatterns.singleton;

public class Logger {

    private static Logger instance;

    private Logger() {}

    public static Logger getInstance() {
        if (instance == null)
            instance = new Logger();
        return instance;
    }

    public void println(String message) {
        System.out.println(message);
    }

}
