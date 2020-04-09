package Lesson16New.task2;

import java.io.Serializable;

public class Computer implements Serializable {
    private static final long serialVersionUID = 1;
    private Keyboard keyboard;
    private Mouse mouse;

    public Computer(Monitor monitor) {
    }

    public Computer(Keyboard a, Monitor b, Mouse c) {
    }

    protected void getMonitor() {
    }
}
