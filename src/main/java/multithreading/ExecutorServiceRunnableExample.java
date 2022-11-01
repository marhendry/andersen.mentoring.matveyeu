package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceRunnableExample extends MultithreadingExample{

    public static void main(String[] args) throws InterruptedException {

        final ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executorService.submit(() -> {final IncrementData incrementData = incrementCounter(counter);
                counterValuesInThreads.put(Thread.currentThread().getName(), incrementData);
            });
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println(counterValuesInThreads);
        executorService.shutdown();

    }
}