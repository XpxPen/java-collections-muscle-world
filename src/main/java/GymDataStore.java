import java.util.ArrayList;
import java.util.HashMap;

public class GymDataStore
    implements DataStoreReadable, DataStoreWritable {

    // TODO: Add your collection here...
    private final HashMap<Integer, Person> personHashMap;

    public GymDataStore() {
        this.personHashMap = new HashMap<Integer, Person>();
    }

    public Boolean addPerson(Integer id, Person person) {
        Boolean retval = false;
        if (!personHashMap.containsKey(id)) {
            personHashMap.put(id, person);
            retval = true;
        }
        return retval;
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
