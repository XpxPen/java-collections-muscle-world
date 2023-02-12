public interface DataStoreWritable {

    /**
     * Returns true if a person was successfully added to the datastore.  Otherwise false.
     * @param id
     * @param person
     * @return
     */
    Boolean addPerson(Integer id, Person person);
}
