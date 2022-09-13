package part_2_readable_good;

import part_2_readable_good.data.Currencies;
import part_2_readable_good.utilities.CurrencyItem;
import part_2_readable_good.utilities.InventoryTable;

public class ProjectView {
    // Constructor
    public ProjectView(int selectedCurrencyIndex) {
        updateView(selectedCurrencyIndex);
    }

    // Public
    public void updateView(int selectedCurrencyIndex) {
        showAppHeader();
        showCurrencySelector(selectedCurrencyIndex);
        System.out.println("Inventory table:");
        InventoryTable.generateTable(selectedCurrencyIndex);
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

    private void showCurrencySelector(int selectedCurrency ) {
        CurrencyItem currency = Currencies.getCurrencies().get(selectedCurrency);

        System.out.println("Currency selected: " + currency.name());
    }
}
