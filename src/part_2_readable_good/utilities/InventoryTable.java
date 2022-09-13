package part_2_readable_good.utilities;

import java.util.List;

public class InventoryTable {
    // Properties
    private final String header = "| Product         | Image | Description                                        | Price |%n";
    private final String border = "+-----------------+-------+----------------------------------------------------+-------+%n";
    private List<InventoryItem> inventory;

    // Constructor
    public InventoryTable(List<InventoryItem> inventory) {
        this.inventory = inventory;
    }

    // Public
    public void generateTable() {
        System.out.format(border);
        System.out.format(header);
        System.out.format(border);
        generateRows(inventory);
        System.out.format(border);
    }

    // Private
    private void generateRows(List<InventoryItem> inventory) {
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
