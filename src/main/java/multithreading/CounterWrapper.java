package multithreading;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CounterWrapper {

    private volatile int counter;

    public synchronized int increment() {
        return ++counter;
    }

}