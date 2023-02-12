import java.util.ArrayList;

public interface DataStoreReadable {
    Person getPerson(Integer id);
    ArrayList<Person> getAllPeople();
}
