import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    private static final GymDataStore gymDatStore = new GymDataStore();

    public static void main(String[] args) {
        var userInput = "";
        while(!userInput.equals("q")) {
            System.out.print("Enter action (r, g, c, q): ");
            userInput = scanner.nextLine();
            switch (userInput) {
                case "r" -> registerPerson();
                case "g" -> selectPerson();
                case "c" -> checkinPerson();
            }
        }
        System.out.println("Bye!");
        scanner.close();
    }

    private static void registerPerson() {
        System.out.print("Enter user Id, first name, last name, plan: ");
        var inputString = scanner.nextLine();
        var st = new StringTokenizer(inputString, ",");
        var id = Integer.parseInt(st.nextToken());
        var firstName= st.nextToken();
        var lastName= st.nextToken();
        var p = new Person(firstName, lastName);
        gymDatStore.addPerson(id, p);
    }

    private static void selectPerson() {
        System.out.print("Enter user Id: ");
        var scanner = new Scanner(System.in);
        var in = Integer.parseInt(scanner.nextLine());
        var p = gymDatStore.getPerson(in);
        System.out.println("Name :" + p);
        System.out.println("Num Visits: " + p.getNumCheckins());
    }

    private static void checkinPerson() {
        System.out.print("Enter user Id, checkin time: ");
        var scanner = new Scanner(System.in);
        var in = scanner.nextLine();
        var st = new StringTokenizer(in, ",");
        var userId = st.nextToken();
        var checkinTime = st.nextToken();

        var p = gymDatStore.getPerson(Integer.parseInt(userId));
        p.addCheckinTime(checkinTime);

        System.out.println(p);
    }
}



//        var p1 = new Person("Alice", "Jones", (byte) 11, "111-11-1111");
//        var p2 = new Person("Bob", "Marly", (byte) 22, "222-22-2222");
//        var p3 = new Person("Charlie", "Daniels", (byte) 33, "333-33-3333");
//        var p4 = new Person("Alice", "Jones", (byte) 11, "111-11-1111");
//
//        var personSet1 = new HashSet<Person>();
//        var personSet2 = new HashSet<Person>();
//
//        personSet1.add(p1);
//        personSet1.add(p2);
//        personSet1.add(p3);
//        personSet1.add(p4);
//
//        personSet2.add(p2);
//        personSet1.addAll(personSet2); // union
//        personSet1.retainAll(personSet2); // intersection
//        System.out.println(personSet1);


//        var pl = PersonRepo.getPeople();
//        var ll = new LinkedList<Person>();
//        var vl = new Vector<Person>();

//        System.out.println(pl.size());
//        System.out.println(vl.capacity());

//        var p1 = new Person("Alice", "Jones", (byte) 11, "111-11-1111");
//        var p2 = new Person("Bob", "Marly", (byte) 22, "222-22-2222");
//        var p3 = new Person("Charlie", "Daniels", (byte) 33, "333-33-3333");
//        var peopleMap = new HashMap<String, Person>();
//        peopleMap.put("111-11-1111", p1);
//        peopleMap.put("222-22-2222", p2);
//        peopleMap.put("333-33-3333", p3);
//        System.out.println(peopleMap.get("111-11-1111"));


//        public class Vector<E>
//                extends AbstractList<E>
//                implements List<E>, RandomAccess, Cloneable, java.io.Serializable
//        {
//
//        public class LinkedList<E>
//                extends AbstractSequentialList<E>
//                implements List<E>, Deque<E>, Cloneable, java.io.Serializable
//        {
//
//        public class ArrayList<E>
//                extends AbstractList<E>
//                implements List<E>, RandomAccess, Cloneable, java.io.Serializable
//        {


//        peopleList
//
//        peopleList.contains()
//
//        System.out.println(l);
