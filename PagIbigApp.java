public class PagIbigApp {
    public static void main(String[] args) {
        HelpDeskStation helpDeskStation1 = new HelpDeskStation(1);
        HelpDeskStation helpDeskStation2 = new HelpDeskStation(2);
        HelpDeskStation helpDeskStation3 = new HelpDeskStation(3);

        helpDeskStation1.serveCustomer();
        helpDeskStation2.serveCustomer();
        helpDeskStation3.serveCustomer();

        // Helpdesk station having an option to reset the queue number
        helpDeskStation3.resetQueueNumber(6);

        helpDeskStation1.serveCustomer();
        helpDeskStation2.serveCustomer();
    }
}
