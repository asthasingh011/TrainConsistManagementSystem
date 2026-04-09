import java.util.Scanner;

public class BogieSorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get number of bogies
        System.out.print("Enter number of passenger bogies: ");
        int n = scanner.nextInt();

        int[] capacities = new int[n];

        // Step 2: Input capacities
        System.out.println("Enter capacities:");
        for (int i = 0; i < n; i++) {
            capacities[i] = scanner.nextInt();
        }

        // Step 3: Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // Swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Step 4: Display sorted result
        System.out.println("Sorted passenger bogie capacities:");
        for (int capacity : capacities) {
            System.out.print(capacity + " ");
        }

        scanner.close();
    }
}