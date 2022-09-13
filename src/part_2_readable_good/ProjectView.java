package part_2_readable_good;

import part_2_readable_good.utilities.CurrencyItem;
import part_2_readable_good.utilities.InventoryItem;
import part_2_readable_good.utilities.InventoryTable;

import java.util.List;

public class ProjectView {
    private final List<CurrencyItem> currencies;
    private final List<InventoryItem> inventory;

    // Constructor
    public ProjectView(List<CurrencyItem> currencies, List<InventoryItem> inventory, int currencyIndex) {
        this.currencies = currencies;
        this.inventory = inventory;

        updateView(currencyIndex);
    }

    // Public
    public void updateView(int currencyIndex) {
        InventoryTable inventoryTable = new InventoryTable(inventory);

        showAppHeader();
        showCurrencySelector(currencyIndex);
        System.out.println("Inventory table:");
        inventoryTable.generateTable();
        showPrompt();
    }

    public void showPrompt() {
        System.out.println("Choose a currency between dollars, rupees, or yuan's.");
        System.out.print("Choose an option and then press enter: ");
    }

    public void showError() {
        System.out.println("⚠️ Invalid option");
    }

    // Private
    private void showAppHeader() {
        System.out.println("2 Reusable Good ✅");
    }

    private void showCurrencySelector(int index ) {
        CurrencyItem selectedCurrency = currencies.get(index);

        System.out.println("Currency selector: " + selectedCurrency.name());
    }
}
