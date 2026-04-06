import java.util.LinkedList;
import java.util.List;

public class UseCase4TrainConsistMgmt {

    public static void main(String[] args) {

        // ===============================
        // Banner
        // ===============================
        System.out.println("=====================================");
        System.out.println("   UC4 - Maintain Ordered Bogie Consist");
        System.out.println("=====================================\n");

        // ===============================
        // Create LinkedList
        // ===============================
        List<String> trainConsist = new LinkedList<>();

        // ===============================
        // Add Bogies (Initial Train)
        // ===============================
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist + "\n");

        // ===============================
        // Insert at specific position
        // ===============================
        trainConsist.add(2, "Pantry Car");

        System.out.println("After Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist + "\n");

        // ===============================
        // Remove First and Last
        // ===============================
        ((LinkedList<String>) trainConsist).removeFirst();
        ((LinkedList<String>) trainConsist).removeLast();

        System.out.println("After Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}