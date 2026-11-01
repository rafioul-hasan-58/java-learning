package bug;

public class FindBug {
    // Helper method 1
    public static int calculateTotal(int price, int quantity) {
        int result = price * quantity;
        return result;
    }

    // Helper method 2: Use to test "Step Out" (Shift + F11)
    public static double applyDiscount(int amount, int discountPercent) {
        // [TEST 4: Step Out (Shift + F11)]
        // Once you are inside here, press "Step Out" to immediately finish
        // this method and jump back out to main()!
        double discount = amount * (discountPercent / 100.0);
        double discountedTotal = amount - discount;
        return discountedTotal;
    }

    public static void main(String[] args) {

        int price = 100;
        int quantity = 3;

        // [TEST 1: Step Over (F10)]
        // If you click "Step Over", it runs calculateTotal() without entering it.
        int total = calculateTotal(price, quantity);

        // [TEST 2: Step Into (F11)]
        // When paused on this line, click "Step Into" to jump INSIDE applyDiscount()!
        double finalPrice = applyDiscount(total, 10);

        System.out.println("Final Price: " + finalPrice);

        // [TEST 3: Continue (F5)]
        // Each time you click "Continue", it jumps directly to the next loop iteration!
        System.out.println("\n--- Loop Testing for 'Continue' ---");
        for (int i = 1; i <= 3; i++) {
            int bonus = i * 10; // <-- PUT BREAKPOINT HERE to test "Continue"
            System.out.println("Iteration " + i + ": bonus = " + bonus);
        }

        System.out.println("\n=== Debugging Practice Complete ===");
    }

}
