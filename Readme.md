# Java Collections Muscle World
Muscle World is a gym that uses a Java console app to keep track of their members.  The application can add, remove,
recall and check-in members into the gym facility.

Assignments are located [here](./Assignments.md).

# Getting Started
- Clone this repo
- Run the application from the [Main](./src/main/java/Main.java) class

# Application Overview
The console application has 6 actions:

| Action   | Description                                          |
|----------|------------------------------------------------------|
| Add      | Adds a new gym member to the system                  |
| Get      | Gets the information for a gym member                |
| Check-in | Logs when a gym member has checked into the facility |
| Report   | Displays a report of all the gym members             |
| Delete   | Permanently deletes a gym member from the system     |
| Quit     | Quits the application                                |

### Add
```
Enter action (a, g, c, r, d, q): a
Enter user Id, first name, last name: 1, Alice, Jones
```

### Get
```
Enter action (a, g, c, r, d, q): g
Enter user Id: 1
Name: Alice Jones
Num visits: 0
```

### Check-in
```
Enter action (a, g, c, r, d, q): c
Enter user Id, checkin time: 1, 1:00
Alice Jones 1:00
```

### Report
```
Enter action (a, g, c, r, d, q): r
*** Muscle World Report ****
Alice Jones
```

### Delete
````
Enter action (a, g, c, r, d, q): d
Enter user Id: 1
Deleted person.
````

### Quit
```
Enter action (a, g, c, r, d, q): q
Bye!
```

# Architecture
...


# Notes
- Built with IntelliJ IDEA 2022.2 (Community Edition)
