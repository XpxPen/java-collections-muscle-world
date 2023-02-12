import java.util.ArrayList;
import java.util.Objects;

public class Person {

    //
    // Data members
    //

    private String firstname;
    private String lastName;
    private ArrayList<String> checkinTimes;

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
        return firstname + " " + lastName;
    }

}
