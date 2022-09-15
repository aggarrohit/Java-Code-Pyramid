package part_2_readable_is_good;

import part_2_readable_is_good.utilities.CurrencyItem;
import part_2_readable_is_good.utilities.CurrencySelector;
import part_2_readable_is_good.utilities.Table;

import java.util.List;

public class ProjectView {
    // Constructor
    public ProjectView(List<CurrencyItem> currencies, String selectedCurrencyName, List<List<String>> inventory) {
        showMenu(currencies, selectedCurrencyName, inventory);
    }

    // Public
    public void showMenu(List<CurrencyItem> currencies, String selectedCurrencyName, List<List<String>> inventory) {
        showCurrencyName(selectedCurrencyName);
        showTable(inventory);
        showPrompt(currencies);
    }

    public void showError() {
        System.out.println("⚠️ Invalid option");
    }

    public void showPrompt(List<CurrencyItem> currencies) {
        CurrencySelector currencySelector = new CurrencySelector(currencies);

        currencySelector.showData();
    }

    // Private
    private void showCurrencyName(String currencyName) {
        System.out.println("Selected currency: " + currencyName);
    }

    private void showTable(List<List<String>> inventory) {
        List<Integer> columnWidths = List.of(15, 5, 50, 15);
        List<String> headers = List.of("Product", "Image", "Description", "Price");
        Table table = new Table(headers,inventory, columnWidths);

        table.showData();
    }
}
