import java.util.Arrays;

/*
 * UC17: Sort Bogie Names Using Arrays.sort()
 */

public class UseCase17TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC17 - Sort Bogie Names");
        System.out.println("=====================================");

        // Create array of bogie names
        String[] bogies = {"Sleeper", "AC Chair", "First Class", "General", "Luxury"};

        // Before sorting
        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(bogies));

        // Built-in sorting
        Arrays.sort(bogies);

        // After sorting
        System.out.println("\nAfter Sorting:");
        System.out.println(Arrays.toString(bogies));

        System.out.println("\nUC17 sorting completed...");
    }
}
