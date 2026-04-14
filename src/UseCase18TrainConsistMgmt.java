/*
 * UC18: Linear Search for Bogie ID
 */

public class UseCase18TrainConsistMgmt {

    // Linear Search Method
    public static boolean linearSearch(String[] bogies, String key) {

        for (int i = 0; i < bogies.length; i++) {

            // Compare using equals()
            if (bogies[i].equals(key)) {
                return true; // Found → early exit
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC18 - Linear Search for Bogie ID");
        System.out.println("=====================================");

        // Array of bogie IDs (unsorted)
        String[] bogies = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        String searchKey = "BG309"; // you can change this

        System.out.println("Searching for Bogie ID: " + searchKey);

        boolean found = linearSearch(bogies, searchKey);

        if (found) {
            System.out.println("Result: Bogie FOUND in train.");
        } else {
            System.out.println("Result: Bogie NOT FOUND.");
        }

        System.out.println("\nUC18 search completed...");
    }
}