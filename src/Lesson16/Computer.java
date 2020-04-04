package Lesson16;
import java.io.Serializable;

public class Computer implements Serializable {
    String name;
    String cpu;
    int ssd;

    public Computer(String name, String cpu, int ssd) {
        this.name = name;
        this.cpu = cpu;
        this.ssd = ssd;
    }
}
