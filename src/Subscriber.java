public class Subscriber {

    // instance fields
    private final int id;

    // static fields
    private static int totalSubscribers;

    // constructor
    public Subscriber(){
        totalSubscribers++;
        this.id = totalSubscribers;

        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ID: " + id;
    }
}