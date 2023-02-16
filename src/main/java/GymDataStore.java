import java.util.ArrayList;

public class GymDataStore
    implements DataStoreReadable, DataStoreWriteable {

    // TODO: Add your collection here to store Person objects...


    public GymDataStore() {

    }

    @Override
    public Boolean addPerson(Integer id, Person person) {
        boolean retval = false;
        // TODO: Implement using your collection...

        return retval;
    }

    @Override
    public Boolean removePerson(Integer id) {
        boolean retval = false;
        // TODO: Implement using your collection...

        return retval;
    }

    @Override
    public Person getPerson(Integer id) {
        // TODO: Implement using your collection...
        return null;
    }

    @Override
    public ArrayList<Person> getAllPeople() {
        ArrayList<Person> retval = new ArrayList<Person>();
        // TODO: Implement using your collection...

        return retval;
    }
}
