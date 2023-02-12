import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class GymDataStore
    implements DataStoreReadable, DataStoreWritable {

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

    public ArrayList<Person> getAllPeople() {
        ArrayList<Person> retval = new ArrayList<Person>();
        var keys = personHashMap.keySet();
        for (Integer key : keys) {
            retval.add(personHashMap.get(key));
        }
        return retval;
    }
}
