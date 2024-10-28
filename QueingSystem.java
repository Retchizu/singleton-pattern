import java.util.concurrent.atomic.AtomicInteger;

public class QueingSystem {
    private static QueingSystem instance;
    private AtomicInteger currentQueueNumber;

    private QueingSystem() {
        currentQueueNumber = new AtomicInteger(0);

    }

    public static synchronized QueingSystem getInstance() {
        if (instance == null) {
            instance = new QueingSystem();
        }
        return instance;
    }

    public AtomicInteger getCurrentQueueNumber() {
        return currentQueueNumber;
    }

    public void resetQueueNumber(int queueNumber) {
        if (queueNumber >= 0) {
            currentQueueNumber.set(queueNumber);
        } else {
            throw new IllegalArgumentException("Queue Number must be non negative");
        }
    }

    public void incrementQueueNumber() {
        currentQueueNumber.incrementAndGet();
    }
}