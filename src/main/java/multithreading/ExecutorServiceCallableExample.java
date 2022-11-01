package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceCallableExample extends MultithreadingExample{

    public static void main(String[] args) throws Exception {

        Callable<IncrementData> incrementDataCallable = () -> {
            final IncrementData incrementData = incrementCounter(counter);
            counterValuesInThreads.put(Thread.currentThread().getName(), incrementData);
            return incrementData;};
        final ExecutorService executorService = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 10; i++) {
            final Future<IncrementData> incrementDataFuture = executorService.submit(incrementDataCallable);
            final int valueAfterIncrement = incrementDataFuture.get().getValueAfterIncrement();
            System.out.printf("Counter has been set to: %s%n", valueAfterIncrement);
        }

        TimeUnit.SECONDS.sleep(2);
        System.out.println(counterValuesInThreads);
        executorService.shutdown();

    }
}