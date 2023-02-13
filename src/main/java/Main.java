import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    private static final GymDataStore gymDataStore = new GymDataStore();

    public static void main(String[] args) {
        var muscleWorldApp = new MuscleWorldApp(gymDataStore, scanner);
        muscleWorldApp.run();
    }
}
