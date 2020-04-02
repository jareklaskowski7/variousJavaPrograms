import java.util.Comparator;

public class Person implements Comparator<Person> {
    private int id;
    private String firstName;
    private String lastName;
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getState().compareTo(p2.getState()), 0);
    }
}
