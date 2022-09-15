package part_2_readable_is_good;

import part_2_readable_is_good.utilities.Table;

import java.util.List;

public class ProjectView {
    // Constructor
    public ProjectView(String selectedCurrencyName, List<List<String>> inventory) {
        showCurrencySelector(selectedCurrencyName);
        showTable(inventory);
        showPrompt();
    }

    // Public
    public void showCurrencySelector(String selectedCurrencyName) {
        System.out.println("Selected currency: " + selectedCurrencyName);
    }

    public void showError() {
        System.out.println("⚠️ Invalid option");
    }

    public void showPrompt() {
        System.out.print("Choose between dollars, rupees, or yuan's: ");
    }

    public void showTable(List<List<String>> inventory) {
        List<Integer> columnWidths = List.of(15, 5, 50, 15);
        List<String> headers = List.of("Product", "Image", "Description", "Price");
        Table table = new Table(headers,inventory, columnWidths);

        System.out.println("Inventory table:");
        table.showData();
    }
}
