package part_2_hope_is_better.utilities;

import java.util.List;

public class Table {
    // Properties
    String header = "| Product         | Image | Description                                        | Price |%n";
    String border = "+-----------------+-------+----------------------------------------------------+-------+%n";
    List<InventoryItem> inventory;

    // Constructor
    public Table(List<InventoryItem> inventory) {
        this.inventory = inventory;
    }

    // Public
    public void showTable() {
        generateLayout();
    }

    // Private
    private void generateLayout() {
        System.out.format(border);
        System.out.format(header);
        System.out.format(border);
        generateRows();
        System.out.format(border);
    }

    private void generateRows() {
        String tableFormat = "| %-15s | %-5s | %-50s | %-5s |%n";

        for (InventoryItem item : inventory) {
            String product = item.name();
            String image = item.image();
            String description = item.description();
            String price = item.price().toString();

            System.out.format(tableFormat, product, image, description, price);
        }
    }
}
