import java.util.HashMap;

public class GymDataStore {

    // TODO: Add your collection here...
    private final HashMap<Integer, Person> personHashMap;

    public GymDataStore() {
        this.personHashMap = new HashMap<Integer, Person>();
    }

    public void addPerson(Integer id, Person person) {
        // Check if person already exists.
        // If not, add them to our data store.
        personHashMap.put(id, person);
    }

    public Person getPerson(Integer id) {
        return personHashMap.get(id);
    }

}
