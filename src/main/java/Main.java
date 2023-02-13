import java.util.*;

public class Main {
    private static final GymDataStore gymDataStore = new GymDataStore();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // try-with-resources
            var muscleWorldApp = new MuscleWorldApp(gymDataStore, scanner);
            muscleWorldApp.run();
        }
    }
}
