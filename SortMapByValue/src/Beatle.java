import java.util.Comparator;

public class Beatle implements Comparator<Beatle> {
    private long id;
    private String firstName;

    public Beatle() {
    }

    public Beatle(long id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public int compare(Beatle b1, Beatle b2) {
        return Integer.compare(b1.getFirstName().compareTo(b2.getFirstName()), 0);
    }
}
