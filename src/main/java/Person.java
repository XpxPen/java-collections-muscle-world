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
        checkinTimes = new ArrayList<>();
        this.firstname = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, Integer id) {
        checkinTimes = new ArrayList<>();
        this.firstname = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    //
    // Methods
    //

    public void addCheckinTime(String time) {
        checkinTimes.add(time);
    }

    public Integer getNumCheckins() {
        return checkinTimes.size();
    }

    //
    // Accessors
    //

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
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
