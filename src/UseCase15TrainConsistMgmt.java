/*
 * UC15: Safe Cargo Assignment using try-catch-finally
 * No package used
 */

// ------------------------------
// Custom Runtime Exception
// ------------------------------
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// ------------------------------
// Goods Bogie Class
// ------------------------------
class GoodsBogie {
    String shape;
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    void assignCargo(String cargoType) {

        try {
            System.out.println("\nAttempting to assign cargo: " + cargoType + " to " + shape + " bogie");

            // ❌ Unsafe condition
            if (shape.equalsIgnoreCase("Rectangular") && cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe Assignment: Petroleum cannot be loaded in Rectangular bogie!");
            }

            // ✅ Safe case
            this.cargo = cargoType;
            System.out.println("Cargo assigned successfully: " + cargoType);

        } catch (CargoSafetyException e) {
            System.out.println("ERROR: " + e.getMessage());

        } finally {
            System.out.println("Assignment process completed for " + shape + " bogie");
        }
    }
}

// ------------------------------
// Main Class
// ------------------------------
public class UseCase15TrainConsistMgmt {

    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println(" UC15 - Safe Cargo Assignment");
        System.out.println("=====================================");

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        // Safe case
        b1.assignCargo("Petroleum");

        // Unsafe case
        b2.assignCargo("Petroleum");

        // Program continues
        b2.assignCargo("Coal");

        System.out.println("\nProgram continues safely...");
    }
}