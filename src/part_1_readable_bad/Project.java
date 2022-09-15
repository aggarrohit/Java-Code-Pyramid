/**
 * Note:
 * This file is excluded is not formatted on purpose to compare the lack of formatting.
 * It also ignores the code enhancement that Intelli-J idea suggest.
 * To see the difference, create a new branch and format the code and click on the warning icon on the top right.
 */

package part_1_readable_bad;

import java.util.List;

public class Project {
    String currency = "usd"; // currency
    // inventory
    List<Item> inventory = List.of(
            new Item(0, "Flashlight", "🔦", "A really great flashlight", 100, "usd"),
            new Item(1, "Tin can", "🥫", "Pretty much what you would expect from a tin can", 32, "usd"),
            new Item(2, "Cardboard Box", "📦", "It holds things", 5, "usd")
    );

    public Project() {
        System.out.println("1 Readable Bad ❌ (fixed in class 😃)");
        System.out.println("Global currency: " + currency);

        generateTable();
    }

    private void generateTable() {
        String border = "+-----------------+-------+----------------------------------------------------+-------+%n";
        String header = "| Product         | Image | Description                                        | Price |%n";

        System.out.format(border);
        System.out.format(header);
        System.out.format(border);
        generateRows(inventory);
        System.out.format(border);
    }

    private void generateRows(List<Item> inventory) {
        String format = "| %-15s | %-5s | %-50s | %-5d |%n";

        for (Item item : inventory) {
            String product = item.product();
            String image = item.image();
            String description = item.description();
            int price = item.price();

            System.out.format(format, product, image, description, price);
        }
    }
}








