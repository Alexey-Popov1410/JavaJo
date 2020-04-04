package Lesson16;
import java.io.Serializable;

public class Notebook extends Computer implements Serializable {
    transient int weight;
    int buttons;
    public Notebook(String name, String cpu, int hdd, int weight, int buttons) {
        super(name, cpu, hdd);
        this.weight = weight;
        this.buttons = buttons;
    }
    Touchpad <Integer> touchPad = new Touchpad<>(2);
}
