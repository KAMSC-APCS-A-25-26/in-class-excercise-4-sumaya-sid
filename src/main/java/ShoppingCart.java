import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: Ask the user how many items they are purchasing
        Scanner sc = new Scanner(System.in);
        System.out.print("How many items are you purchasing? ");
        int items = sc.nextInt();
        // TODO: Use a for loop to read each item's price (double)
        double price;
        double total = 0.00;
        for (int j=1; j<items+1; j++)
        {
            System.out.print("Price of item " + j + "? ");
            price = sc.nextDouble();
            total += price;
        }

        System.out.print("Your cart has " + items + " items with a total cost of $" + total);
        // TODO: Accumulate the total cost
        // TODO: Print the final summary line with item count and total
        // TODO: Use Scanner for input
    }
}
