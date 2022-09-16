package part_2_readable_is_good;

import part_2_readable_is_good.utilities.CurrencyItem;
import part_2_readable_is_good.utilities.InventoryItem;
import part_2_readable_is_good.utilities.Table;

import java.util.ArrayList;
import java.util.List;

public class ProjectView {
    // Constructor
    public ProjectView(List<CurrencyItem> currencies, CurrencyItem selectedCurrency, List<InventoryItem> inventory) {
        showCurrencyName(selectedCurrency);
        showTable(inventory);
        showPrompt();
    }

    // Public
    public void showError() {
        System.out.println("⚠️ Invalid option");
    }

    public void showPrompt() {
        System.out.println("Choose a currency between dollars, rupees, yuan's");
        System.out.print("Choose an option and then press enter: ");
    }

    // Private
    private void showCurrencyName(CurrencyItem selectedCurrency) {
        System.out.println("Selected currency: " + selectedCurrency.name());
    }

    private void showTable(List<InventoryItem> inventory) {
        List<Integer> columnWidths = List.of(15, 5, 50, 5);
        List<String> headers = List.of("Product", "Image", "Description", "Price");
        List<List<String>> body = parseInventory(inventory);
        Table table = new Table(columnWidths, headers, body);

        table.showData();
    }

    private List<List<String>> parseInventory(List<InventoryItem> inventory) {
        List<List<String>> result = new ArrayList<>();

        for (InventoryItem item: inventory) {
            String name = item.name();
            String image = item.image();
            String description = item.description();
            String price = item.price().toString();
            List<String> data = List.of(name, image, description, price);

            result.add(data);
        }

        return result;
    }
}
