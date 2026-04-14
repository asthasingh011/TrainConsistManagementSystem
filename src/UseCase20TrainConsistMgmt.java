import java.util.Arrays;

/*
 * UC20: Exception Handling During Search Operations
 * Fail-Fast using IllegalStateException
 */

public class UseCase20TrainConsistMgmt {

    // Binary Search (reuse logic from UC19)
    public static boolean binarySearch(String[] bogies, String key) {

        int low = 0, high = bogies.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int cmp = bogies[mid].compareTo(key);

            if (cmp == 0) return true;
            else if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC20 - Safe Search with Validation");
        System.out.println("=====================================");

        // 🔴 Test case 1: Empty array (should throw exception)
        String[] bogies = {};

        String searchKey = "BG101";

        try {
            // ✅ FAIL-FAST CHECK
            if (bogies.length == 0) {
                throw new IllegalStateException("Search failed: No bogies available in train!");
            }

            // Sort before binary search
            Arrays.sort(bogies);

            boolean found = binarySearch(bogies, searchKey);

            if (found) {
                System.out.println("Result: Bogie FOUND");
            } else {
                System.out.println("Result: Bogie NOT FOUND");
            }

        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // ✅ Program continues
        System.out.println("\nProgram continues safely...");

        // 🔵 Test case 2: Valid data
        String[] bogies2 = {"BG101", "BG205", "BG309"};

        try {
            if (bogies2.length == 0) {
                throw new IllegalStateException("No bogies available!");
            }

            Arrays.sort(bogies2);

            boolean found = binarySearch(bogies2, "BG205");

            System.out.println("\nSecond Search Result: " + (found ? "FOUND" : "NOT FOUND"));

        } catch (IllegalStateException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}