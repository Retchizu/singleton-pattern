public class HelpDeskStation {
    private int stationNumber;
    private QueingSystem queingSystem;

    public HelpDeskStation(int stationNumber) {
        this.stationNumber = stationNumber;
        this.queingSystem = QueingSystem.getInstance();
    }

    public void serveCustomer() {
        int currentQueueNumber = queingSystem.getCurrentQueueNumber();
        System.out.println("Station no." + stationNumber + " is serving customer no." + currentQueueNumber);
        queingSystem.incrementQueueNumber();
    }

    public void resetQueueNumber(int queueNumber) {
        queingSystem.resetQueueNumber(queueNumber);
    }
}
