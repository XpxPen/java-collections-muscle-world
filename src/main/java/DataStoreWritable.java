public interface DataStoreWritable {

    /**
     * Returns true if a person was successfully added to the datastore, otherwise false.
     * Duplicate user ids are not permitted.
     * @param id
     * @param person
     * @return
     */
    Boolean addPerson(Integer id, Person person);
}
