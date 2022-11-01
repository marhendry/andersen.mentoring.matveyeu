package multithreading;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class MultithreadingExample {

    static volatile CounterWrapper counter = new CounterWrapper();
    static volatile Map<String, IncrementData> counterValuesInThreads = new LinkedHashMap<>();

    public static synchronized IncrementData incrementCounter(CounterWrapper counter) {

        final IncrementData incrementData = new IncrementData();
        incrementData.setTimeBeforeIncrement(LocalDateTime.now())
                .setValueBeforeIncrement(counter.getCounter());

        final int newCounterValue = counter.increment();

        incrementData.setValueAfterIncrement(newCounterValue)
                .setTimeAfterIncrement(LocalDateTime.now());

        return incrementData;
    }
}