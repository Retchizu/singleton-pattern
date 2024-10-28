public class QueingSystem {
    private static QueingSystem instance;
    private int currentQueueNumber;

    private QueingSystem() {

    }

    public static synchronized QueingSystem getInstance() {
        if (instance == null) {
            instance = new QueingSystem();
        }
        return instance;
    }

    public int getCurrentQueueNumber() {
        return currentQueueNumber;
    }

    public void resetQueueNumber(int queueNumber) {
        if (queueNumber >= 0) {
            currentQueueNumber = queueNumber;
        } else {
            throw new IllegalArgumentException("Queue Number must be non negative");
        }
    }

    public void incrementQueueNumber() {
        currentQueueNumber++;
    }
}