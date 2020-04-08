package Lesson21ThreadExecuters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepBufferedReaderTask {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        service.submit(() -> {
            int finalSleepSeconds;
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
                while (true) {
                    System.out.println("Время сна : ");
                    String s;
                    if (!(s = bufferedReader.readLine()).equals("")) {
                        finalSleepSeconds = Integer.parseInt(s);
                    } else {
                        continue;
                    }
                    if (finalSleepSeconds == -1) {
                        return;
                    }
                    try {
                        TimeUnit.SECONDS.sleep(finalSleepSeconds);
                        System.out.printf(" Я спал %d секунд\n", finalSleepSeconds);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            } catch (IOException | NumberFormatException e) {
                e.printStackTrace();
            }
        });
        service.shutdown();
    }
}
