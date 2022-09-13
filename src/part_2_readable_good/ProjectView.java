package part_2_readable_good;

import part_2_readable_good.utilities.CurrencyItem;
import part_2_readable_good.utilities.InventoryItem;

import java.util.List;

public class ProjectView {
    // Constructor
    public ProjectView(List<CurrencyItem> currencies, List<InventoryItem> inventory, int currencyIndex) {
        renderView(currencies, inventory, currencyIndex);
    }

    // Public
    public void renderView(List<CurrencyItem> currencies, List<InventoryItem> inventory, int currencyIndex) {
        showAppHeader();
        showCurrencySelector(currencies, currencyIndex);
        showInventoryTable(inventory);
        showPrompt();
    }

    // Private
    private void showAppHeader() {
        System.out.println("2 Reusable Good ✅");
    }

    private void showCurrencySelector(List<CurrencyItem> currencies, int index ) {
        CurrencyItem selectedCurrency = currencies.get(index);

        System.out.println("Currency selector: " + selectedCurrency.name());
    }

    private void showInventoryTable(List<InventoryItem> inventory) {

    }

    private void showPrompt() {

    }
}
