import java.util.ArrayList;

public class Person {

    //
    // Data members
    //

    private Integer id;
    private String firstname;
    private String lastName;
    private final ArrayList<String> checkinTimes;

    //
    // Constructors
    //

    public Person() {
        checkinTimes = new ArrayList<>();
    }

    public Person(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstname = firstName;
        checkinTimes = new ArrayList<>();
    }

    public Person(String firstName, String lastName, Integer id) {
        this.id = id;
        this.lastName = lastName;
        this.firstname = firstName;
        checkinTimes = new ArrayList<>();
    }

    //
    // Public methods
    //

    public void addCheckinTime(String time) {
        checkinTimes.add(time);
    }

    public Integer getNumCheckins() {
        return checkinTimes.size();
    }

    //
    // Overrides
    //

    @Override
    public String toString() {
        if (id != null) {
            return id + " " + firstname + " " + lastName;
        } else {
            return firstname + " " + lastName;
        }
    }
}
