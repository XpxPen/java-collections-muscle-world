import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    private static final GymDataStore gymDatStore = new GymDataStore();

    public static void main(String[] args) {
        var userInput = "";
        while(!userInput.equals("q")) {
            System.out.print("Enter action (a, g, c, r, q): ");
            userInput = scanner.nextLine();
            switch (userInput) {
                case "a" -> addPerson();
                case "g" -> selectPerson();
                case "c" -> checkinPerson();
                case "r" -> runReport();
            }
        }
        System.out.println("Bye!");
        scanner.close();
    }

    private static void addPerson() {
        System.out.print("Enter user Id, first name, last name: ");
        var inputString = scanner.nextLine();
        var stringTokenizer = new StringTokenizer(inputString, ",");
        var id = Integer.parseInt(stringTokenizer.nextToken());
        var firstName= stringTokenizer.nextToken();
        var lastName= stringTokenizer.nextToken();
        var person = new Person(firstName, lastName);
        gymDatStore.addPerson(id, person);
    }

    private static void selectPerson() {
        System.out.print("Enter user Id: ");
        var scanner = new Scanner(System.in);
        var in = Integer.parseInt(scanner.nextLine());
        var p = gymDatStore.getPerson(in);
        System.out.println("Name:" + p);
        System.out.println("Num visits: " + p.getNumCheckins());
    }

    private static void checkinPerson() {
        System.out.print("Enter user Id, checkin time: ");
        var scanner = new Scanner(System.in);
        var in = scanner.nextLine();
        var stringTokenizer = new StringTokenizer(in, ",");
        var userId = stringTokenizer.nextToken();
        var checkinTime = stringTokenizer.nextToken();
        var person = gymDatStore.getPerson(Integer.parseInt(userId));
        person.addCheckinTime(checkinTime);
        System.out.println(person + " " + checkinTime);
    }

    private static void runReport() {
        System.out.println("*** Muscle World Report ****");
        var peopleList = gymDatStore.getAllPeople();
        for (Person p : peopleList) {
            System.out.println(p);
        }
    }
}
