public interface DataStoreWriteable {

    /**
     * Returns true if a person was successfully added to the datastore, otherwise false.
     * Duplicate user ids are not permitted.
     */
    Boolean addPerson(Integer id, Person person);

    /**
     * Returns true if a person was successfully removed from the datastore, otherwise false.
     */
    Boolean removePerson(Integer id);
}
