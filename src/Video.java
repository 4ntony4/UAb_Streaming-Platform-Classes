import java.time.*;
import java.util.ArrayList;

public class Video {

    enum Classification {
        M_6,
        M_12,
        M_18
    }
    enum Genre {
        DRAMA,
        CRIME,
        COMEDY,
        ACTION,
        ANIMATION
    }

    // instance fields
    private final String title;
    private final LocalTime duration;
    private final LocalDate launchDate;
    private final Classification classification;
    private final Genre genre;
    private final boolean availability;
    private final String synopsis;
    private final String imageURL;
    private int totalVisualizations;
    private int totalLikes;

    // static fields
    private static ArrayList<Video> videoList;


    // constructor
    public Video(String title,
                 LocalTime duration,
                 LocalDate launchDate,
                 Classification classification,
                 Genre genre,
                 boolean availability,
                 String synopsis,
                 String imageURL) {

        this.title = title;
        this.duration = duration;
        this.launchDate = launchDate;
        this.classification = classification;
        this.genre = genre;
        this.availability = availability;
        this.synopsis = synopsis;
        this.imageURL = imageURL;

        this.totalVisualizations = 0;
        this.totalLikes = 0;

        if (videoList == null) {
            videoList = new ArrayList<>();
        }
        videoList.add(this);

        System.out.println(this);
        System.out.println(this.title+" added successfully.");
        System.out.println("videoList size is " + videoList.size());
    }


    @Override
    public String toString() {
        char delimiter = '|';
        return title + delimiter +
                duration + delimiter +
                launchDate + delimiter +
                classification + delimiter +
                genre + delimiter +
                availability + delimiter +
                synopsis + delimiter +
                imageURL;
    }


    public static void listAvailableVideos() {
        System.out.println("Available Videos: ");
        for (Video v : videoList) {
            if (v.availability) {
                System.out.println(v.title);
            }
        }
        System.out.println("Total: " + videoList.size());
    }

    public static void printLines() {
        char delimiter = '|';
        for (Video v : videoList) {
            System.out.println(v.title+delimiter+v.genre+delimiter+v.totalVisualizations+delimiter+v.totalLikes);
        }
    }


    public void addVisualization() {
        this.totalVisualizations++;
    }

    public void addLike() {
        this.totalLikes++;
    }

    // getters
    public String getTitle() {
        return title;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public LocalDate getLaunchDate() {
        return launchDate;
    }

    public Classification getClassification() {
        return classification;
    }

    public Genre getGenre() {
        return genre;
    }

    public boolean getAvailability() {
        return availability;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public String getImageURL() {
        return imageURL;
    }

    public int getTotalVisualizations() {
        return totalVisualizations;
    }

    public int getTotalLikes() {
        return totalLikes;
    }
}
