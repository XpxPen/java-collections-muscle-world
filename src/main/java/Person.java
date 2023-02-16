public class Person {

    //
    // Data members
    //

    private Integer id;
    private String firstname;
    private String lastName;

    // TODO: Add your collection here to store check-ins...

    //
    // Constructors
    //

    public Person() {

    }

    public Person(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstname = firstName;
    }

    public Person(String firstName, String lastName, Integer id) {
        this.id = id;
        this.lastName = lastName;
        this.firstname = firstName;
    }

    //
    // Public methods
    //

    public void addCheckinTime(String time) {
        // TODO: Implement this method using your collection...
    }

    public Integer getNumCheckins() {
        // TODO: Implement this method using your collection...
        return 0;
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
