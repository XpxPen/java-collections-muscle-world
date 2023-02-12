import java.util.ArrayList;

public interface DataStoreReadable {
    /**
     * Gets a Person for the id specified.
     * @param id
     * @return
     */
    Person getPerson(Integer id);

    /**
     * Gets all the people from the datastore in no particular order.
     * @return
     */
    ArrayList<Person> getAllPeople();
}
