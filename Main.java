public class Main {
    public static void main (String[] args) {

        NewsAgency agency = new NewsAgency();

        Subscriber s1 = new NewsSubscriber("Taylor");
        Subscriber s2 = new NewsSubscriber("Sabrina");
        Subscriber s3 = new NewsSubscriber("Krystal");

        agency.subscribe(s1);
        agency.subscribe(s2);

        agency.publishNews("Earthquake hits the city!");

        agency.subscribe(s3);
        agency.unsubscribe(s2);

        agency.publishNews("New president elected!");
    }
}