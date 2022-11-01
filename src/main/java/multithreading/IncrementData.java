package multithreading;

import java.time.LocalDateTime;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class IncrementData {

    private int valueBeforeIncrement;

    private int valueAfterIncrement;

    private LocalDateTime timeBeforeIncrement;

    private LocalDateTime timeAfterIncrement;

}