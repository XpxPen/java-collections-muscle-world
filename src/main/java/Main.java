import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    private static final GymDataStore gymDataStore = new GymDataStore();

    public static void main(String[] args) {
        System.out.println("*** Muscle World ***");
        var userInput = "";
        while(!userInput.equals("q")) {
            System.out.print("Enter action (a, g, c, r, d, q): ");
            userInput = scanner.nextLine();
            switch (userInput) {
                case "a" -> addPerson();
                case "r" -> runReport();
                case "g" -> selectPerson();
                case "d" -> deletePerson();
                case "c" -> checkinPerson();
            }
        }
        System.out.println("Bye!");
        scanner.close();
    }

    private static void deletePerson() {
        System.out.print("Enter user Id: ");
        var userId = Integer.parseInt(scanner.nextLine());
        if (gymDataStore.removePerson(userId)) {
            System.out.println("Deleted person.");
        } else {
            System.out.println("Person not found.");
        }
    }

    private static void addPerson() {
        System.out.print("Enter user Id, first name, last name: ");
        var inputString = scanner.nextLine();
        var stringTokenizer = new StringTokenizer(inputString, ",");
        var userId = Integer.parseInt(stringTokenizer.nextToken());
        var firstName= stringTokenizer.nextToken();
        var lastName= stringTokenizer.nextToken();
        var person = new Person(firstName, lastName);
        gymDataStore.addPerson(userId, person);
    }

    private static void selectPerson() {
        System.out.print("Enter user Id: ");
        var in = Integer.parseInt(scanner.nextLine());
        var person = gymDataStore.getPerson(in);
        System.out.println("Name:" + person);
        System.out.println("Num visits: " + person.getNumCheckins());
    }

    private static void checkinPerson() {
        System.out.print("Enter user Id, checkin time: ");
        var in = scanner.nextLine();
        var stringTokenizer = new StringTokenizer(in, ",");
        var userId = stringTokenizer.nextToken();
        var checkinTime = stringTokenizer.nextToken();
        var person = gymDataStore.getPerson(Integer.parseInt(userId));
        person.addCheckinTime(checkinTime);
        System.out.println(person + " " + checkinTime);
    }

    private static void runReport() {
        System.out.println("*** Muscle World Report ****");
        var peopleList = gymDataStore.getAllPeople();
        for (Person p : peopleList) {
            System.out.println(p);
        }
    }
}
