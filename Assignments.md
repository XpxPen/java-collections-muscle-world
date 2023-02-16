# Java Collection Muscle World Assignments
Muscle World is a gym that uses a Java app to keep track of their members.

# Ex 1: Implement Collection: GymDataStore
Implement a collection of your choice in the [GymDataStore](./src/main/java/GymDataStore.java) class.  This collection  
acts as the primary datastore for the application.  Test the following actions:
- Add
- Get
- Delete
- Report

# Ex 2: Implement Collection: Person
Implement a collection of your choice in the [Person](./src/main/java/Person.java) class. Test the following actions:
- Check-in
- Report

# Ex 3: Modifiy Report
Modify the report to show the total number of visits for each member.

Example:
```
Enter action (a, g, c, r, d, q): r
*** Muscle World Report ****
Alice Jones (2 visits)
Bob Marley (6 visits)
Charlie Daniels (5 visits)
```

# Ex 4: Validation Hardening
Modify the application so that it does not crash when user input has not been entered correctly.  Potentially use the
[ValidationException](./src/main/java/ValidationException.java) class.

# Ex 5: Persist Datastore
Write the contents of the datastore to a file when the application quits.
