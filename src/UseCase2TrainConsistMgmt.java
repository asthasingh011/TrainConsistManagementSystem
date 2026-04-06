import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistMgmt {

    public static void main(String[] args) {

        // ===============================
        // Banner
        // ===============================
        System.out.println("=====================================");
        System.out.println("   UC2 - Add Passenger Bogies to Train");
        System.out.println("=====================================\n");

        // ===============================
        // Create ArrayList
        // ===============================
        List<String> passengerBogies = new ArrayList<>();

        // ===============================
        // CREATE (Add Bogies)
        // ===============================
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // ===============================
        // DELETE (Remove Bogie)
        // ===============================
        passengerBogies.remove("AC Chair");

        System.out.println("After Removing 'AC Chair':");
        System.out.println("Passenger Bogies : " + passengerBogies + "\n");

        // ===============================
        // READ (Check existence)
        // ===============================
        System.out.println("Checking if 'Sleeper' exists:");
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper? : " + exists + "\n");

        // ===============================
        // FINAL STATE
        // ===============================
        System.out.println("Final Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}