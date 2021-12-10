import java.time.*;

public class Visualization {

    // instance fields
    private final Video video;
    private final Subscriber subscriber;
    private final LocalDate visualizationDate;
    private final boolean subscriberLike;

    // constructor
    public Visualization(Video video, Subscriber subscriber, LocalDate visualizationDate, boolean subscriberLike) {
        this.video = video;
        this.subscriber = subscriber;
        this.visualizationDate = visualizationDate;
        this.subscriberLike = subscriberLike;

        this.video.addVisualization();
        if (this.subscriberLike) {
            this.video.addLike();
        }

        System.out.println(this);
        System.out.println("Visualization added successfully.");
    }

    @Override
    public String toString() {
        char delimiter = '|';
        return video.getTitle() + delimiter +
                subscriber + delimiter +
                visualizationDate + delimiter +
                subscriberLike;
    }

    public int totalVisualizationsPerVideo() {
        return this.video.getTotalVisualizations();
    }

    public int totalLikesPerVideo() {
        return this.video.getTotalLikes();
    }


    // getters
    public Video getVideo() {
        return video;
    }

    public Subscriber getSubscriber() {
        return subscriber;
    }

    public LocalDate getVisualizationDate() {
        return visualizationDate;
    }

    public boolean getSubscriberLike() {
        return subscriberLike;
    }
}
