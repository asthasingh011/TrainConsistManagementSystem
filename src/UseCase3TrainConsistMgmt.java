import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistMgmt {

    public static void main(String[] args) {

        // ===============================
        // Banner
        // ===============================
        System.out.println("=====================================");
        System.out.println("   UC3 - Track Unique Bogie IDs");
        System.out.println("=====================================\n");

        // ===============================
        // Create HashSet (No duplicates allowed)
        // ===============================
        Set<String> bogies = new HashSet<>();

        // ===============================
        // ADD Bogie IDs (with duplicates)
        // ===============================
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored)
        bogies.add("BG101");
        bogies.add("BG102");

        // ===============================
        // Display Result
        // ===============================
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}