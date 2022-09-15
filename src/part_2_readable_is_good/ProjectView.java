package part_2_readable_is_good;

import part_2_readable_is_good.utilities.CurrencyItem;
import part_2_readable_is_good.utilities.InventoryItem;
import part_2_readable_is_good.utilities.Table;

import java.util.List;

public class ProjectView {
    // Constructor
    public ProjectView(int selectedCurrencyId, List<CurrencyItem> currencies, List<InventoryItem> inventory) {
        showCurrencySelector(currencies, selectedCurrencyId);
        showTable(inventory);
        showPrompt();
    }

    // Public
    public void showCurrencySelector(List<CurrencyItem> currencies, int selectedCurrencyId) {
        System.out.println("Selected currency id: " + selectedCurrencyId);
    }

    public void showError() {
        System.out.println("⚠️ Invalid option");
    }

    public void showPrompt() {
        System.out.print("Choose between dollars, rupees, or yuan's: ");
    }

    public void showTable(List<InventoryItem> inventory) {
        Table table = new Table(inventory);

        System.out.println("Inventory table:");
        table.showTable();
    }
}
