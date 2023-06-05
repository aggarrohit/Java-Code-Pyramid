package part_2_readable_bad.utilities;

import part_2_readable_bad.data.Inventory;

public class InventoryTable {
    // Properties
    private static final String header = "| Product         | Image | Description                                        | Price     |%n";
    private static final String border = "+-----------------+-------+----------------------------------------------------+-----------+%n";

    // Public
    public static void generateTable(int selectedCurrencyIndex) {
        System.out.format(border);
        System.out.format(header);
        System.out.format(border);
        generateRows(selectedCurrencyIndex);
        System.out.format(border);
    }

    // Private
    private static void generateRows(int selectedCurrency) {
        String tableFormat = "| %-15s | %-5s | %-50s | %-10s |%n";

        for (InventoryItem item : Inventory.getInventory()) {
            String product = item.product();
            String image = item.image();
            String description = item.description();
            String price = CurrencyConverter.convertCurrency(item.price(), selectedCurrency);

            System.out.format(tableFormat, product, image, description, price);
        }
    }
}
