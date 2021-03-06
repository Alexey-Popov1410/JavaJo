package Lesson19Thread.Task2;

public class Factory implements Runnable {
    private Dump dump;
    private Scientist scientist1;
    private Scientist scientist2;
    private Assistant assistant1;
    private Assistant assistant2;


    public Factory() {
        this.dump = new Dump();
        scientist1 = new Scientist();
        scientist2 = new Scientist();
        this.assistant1 = new Assistant(dump, scientist1);
        this.assistant2 = new Assistant(dump, scientist2);
    }

    public static void main(String[] args) {
        new Thread(new Factory(), "Factory").start();
    }

    public void throwOutDetails() {
        synchronized (dump) {
            int countOfDetails = new Double(Math.random() * 4 + 1).intValue();      /*1-4 detail(s) threow*/
            RobotComponents[] robotComponents1s = RobotComponents.values();
            for (int i = 0; i < countOfDetails; i++) {
                Double randomEnum = Math.random() * RobotComponents.values().length;
                dump.addRobotComponent(robotComponents1s[randomEnum.intValue()]);
            }
        }
    }

    @Override
    public void run() {
        Thread assistant1 = new Thread(this.assistant1, "Assistant1");
        assistant1.setDaemon(true);
        Thread assistant2 = new Thread(this.assistant2, "Assistant2");
        assistant2.setDaemon(true);
        Thread scientist1 = new Thread(this.scientist1, "Scientist1");
        scientist1.setDaemon(true);
        Thread scientist2 = new Thread(this.scientist2, "Scientist2");
        scientist2.setDaemon(true);
        scientist1.start();
        scientist2.start();

        assistant1.start();
        assistant2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("\t The night began");
            this.throwOutDetails();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
