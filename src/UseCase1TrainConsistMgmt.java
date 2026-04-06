import java.util.ArrayList;
import java.util.List;

public class UseCase1TrainConsistMgmt {

    public static void main(String[] args) {

        // ===============================
        // Welcome Banner
        // ===============================
        System.out.println("=====================================");
        System.out.println("   === Train Consist Management App ===");
        System.out.println("=====================================\n");

        // ===============================
        // Initialize Train Consist
        // ===============================
        List<String> trainConsist = new ArrayList<>();

        // ===============================
        // Display Initial State
        // ===============================
        System.out.println("Train initialized successfully...");
        System.out.println("Initial Bogie Count : " + trainConsist.size());
        System.out.println("Current Train Consist : " + trainConsist);

        System.out.println("\nSystem ready for operations...");
    }
}