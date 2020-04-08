package Lesson19Thread;

public class Task1 {
    public static void stream() {
        MyThread thread = new MyThread();
        MyDaemon daemon = new MyDaemon();
        daemon.setDaemon(true);
        thread.start();
        daemon.start();
    }

    public static class MyThread extends Thread {
        private static long sum = 0;
        public void run() {
            System.out.println(" The thread started : " + getName());
            for (int i = 1; i < 10000000; i++) {
                if (i % 2 == 0 && i % 3 == 0) {
                    sum += i;
                }
                if (i % 1000000 == 0) {
                    try {
                        sleep(10);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                }
            } System.out.printf(getName() + " The amount - %,25d\n", sum);
        }
    }

    public static class MyDaemon extends Thread {
        public void run() {
            System.out.println(" The thread started : " + getName());
            while (true) {
                try {
                    sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf(getName() + " The amount - %,18d\n", MyThread.sum);
            }
        }
    }


    public static void main(String[] args) {
        stream();
    }
}
