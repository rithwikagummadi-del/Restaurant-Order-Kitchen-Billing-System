import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int choice;

        System.out.println("RESTAURANT ORDER SYSTEM");

        System.out.println("1. Dine-in");
        System.out.println("2. Takeaway");
        System.out.print("Choose order type: ");
        int type = sc.nextInt();

        if (type == 1) {
            System.out.println("Order Type: Dine-in");
        } else {
            System.out.println("Order Type: Takeaway");
        }

        while (true) {

            System.out.println("\nMENU");
            System.out.println("1. Pizza - Rs.200");
            System.out.println("2. Burger - Rs.120");
            System.out.println("3. Biryani - Rs.180");
            System.out.println("4. Sandwich - Rs.100");
            System.out.println("5. Finish Order");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 5) {
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            int price = 0;
            String item = "";

            switch (choice) {

                case 1:
                    item = "Pizza";
                    price = 200;
                    break;

                case 2:
                    item = "Burger";
                    price = 120;
                    break;

                case 3:
                    item = "Biryani";
                    price = 180;
                    break;

                case 4:
                    item = "Sandwich";
                    price = 100;
                    break;

                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            int amount = price * quantity;
            total = total + amount;

            System.out.println(item + " sent to kitchen.");
            System.out.println("Kitchen Status: Preparing");
        }

        System.out.println("\n----- FINAL BILL -----");

        // for loop
        for (int i = 1; i <= 1; i++) {
            System.out.println("Total Amount: Rs." + total);
        }

        System.out.println("Kitchen Status: Order Completed");
        System.out.println("Thank you! Visit again.");

        sc.close();
    }
}