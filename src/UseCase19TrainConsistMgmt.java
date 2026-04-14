import java.util.Arrays;

/*
 * UC19: Binary Search for Bogie ID
 */

public class UseCase19TrainConsistMgmt {

    // Binary Search Method
    public static boolean binarySearch(String[] bogies, String key) {

        int low = 0;
        int high = bogies.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = bogies[mid].compareTo(key);

            if (comparison == 0) {
                return true; // Found
            } 
            else if (comparison < 0) {
                low = mid + 1; // Search right
            } 
            else {
                high = mid - 1; // Search left
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC19 - Binary Search for Bogie ID");
        System.out.println("=====================================");

        // Unsorted input (important test case)
        String[] bogies = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Sort first (required for binary search)
        Arrays.sort(bogies);

        System.out.println("Sorted Bogies: " + Arrays.toString(bogies));

        String searchKey = "BG205";

        System.out.println("Searching for: " + searchKey);

        boolean found = binarySearch(bogies, searchKey);

        if (found) {
            System.out.println("Result: Bogie FOUND");
        } else {
            System.out.println("Result: Bogie NOT FOUND");
        }

        System.out.println("\nUC19 search completed...");
    }
}
