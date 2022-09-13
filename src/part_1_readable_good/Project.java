package part_1_readable_good;

import java.util.List;

public class Project {
    String currency = "usd";
    List<InventoryItem> inventory = List.of(
            new InventoryItem(0,"Flashlight", "🔦", "A really great flashlight", 100, "usd"),
            new InventoryItem(1,"Tin can", "🥫", "Pretty much what you would expect from a tin can", 32, "usd"),
            new InventoryItem(2,"Cardboard Box", "📦", "It holds things", 5, "usd")
    );
    String tableHeader = "| Product         | Image | Description                                        | Price |%n";
    String tableBorder = "+-----------------+-------+----------------------------------------------------+-------+%n";

    public Project() {
        System.out.println("1 Readable Good ✅");
        System.out.println("Global currency: " + currency);
        System.out.format(tableBorder);
        System.out.format(tableHeader);
        System.out.format(tableBorder);
        generateRows();
        System.out.format(tableBorder);
    }

    private void generateRows() {
        String tableFormat = "| %-15s | %-5s | %-50s | %-5d |%n";

        for (InventoryItem item : inventory) {
            String product = item.product();
            String image = item.image();
            String description = item.description();
            int price = item.price();

            System.out.format(tableFormat, product, image, description, price);
        }
    }
}
