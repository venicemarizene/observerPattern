import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestNews;

    public void subscribe (Subscriber subscriber) {
        subscribers.add (subscriber);
        System.out.print("\n" + subscriber.getName() + " subscribed to the news agency.");
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
        System.out.print("\n" + subscriber.getName() + " unsubscribed from the news agency.");
    }

    public void publishNews(String news) {
        this.latestNews = news;
        System.out.println("\n\n--- Breaking News Published ---");
        System.out.println(news);

        notifySubscribers();
    }

    private void notifySubscribers() {
        System.out.println("\nNotifying subscribers...");

        for (Subscriber subscriber : subscribers) {
            subscriber.update(latestNews);
        }
    }
}