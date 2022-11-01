package multithreading;

import java.util.concurrent.TimeUnit;

public class RunnableExample extends MultithreadingExample{

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 10; i++) {
            Runnable runnable = () -> {
                final IncrementData incrementData = incrementCounter(counter);
                counterValuesInThreads.put(Thread.currentThread().getName(), incrementData);
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
        TimeUnit.SECONDS.sleep(2);
        System.out.println(counterValuesInThreads);
    }
}