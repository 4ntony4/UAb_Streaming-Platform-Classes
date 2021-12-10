import java.time.*;

public class Main {

    public static void main(String[] args) {

        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();

        Video video1 = new Video("Lion King",
                LocalTime.now(),
                LocalDate.now(),
                Video.Classification.M_6,
                Video.Genre.ANIMATION,
                true,
                "[nothing yet]",
                "[nothing yet]");
        Video video2 = new Video("Hercules",
                LocalTime.now(),
                LocalDate.now(),
                Video.Classification.M_6,
                Video.Genre.ANIMATION,
                true,
                "[nothing yet]",
                "[nothing yet]");
        Video video3 = new Video("Mulan",
                LocalTime.now(),
                LocalDate.now(),
                Video.Classification.M_6,
                Video.Genre.ANIMATION,
                true,
                "[nothing yet]",
                "[nothing yet]");


        Video.listAvailableVideos();
        Video.printLines();

        Visualization v1 = new Visualization(video1,
                s1,
                LocalDate.now(),
                true);
        Visualization v2 = new Visualization(video2,
                s1,
                LocalDate.now(),
                true);
        Visualization v3 = new Visualization(video3,
                s1,
                LocalDate.now(),
                true);
        Visualization v4 = new Visualization(video1,
                s2,
                LocalDate.now(),
                false);

        System.out.println();
        System.out.println(v1.getVideo().getTitle());
        System.out.println("Views: " +
                v1.totalVisualizationsPerVideo());
        System.out.println("Likes: " +
                v1.totalLikesPerVideo());
        System.out.println();
    }
}