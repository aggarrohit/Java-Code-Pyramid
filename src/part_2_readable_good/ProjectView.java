package part_2_readable_good;

import part_2_readable_good.utilities.CurrencyItem;
import part_2_readable_good.utilities.CurrencySelector;
import part_2_readable_good.utilities.Table;

import java.util.List;

public class ProjectView {
    // Constructor
    public ProjectView(List<CurrencyItem> currencies, CurrencyItem selectedCurrency, List<List<String>> inventory) {
        showMenu(currencies, selectedCurrency, inventory);
    }

    // Public
    public void showMenu(List<CurrencyItem> currencies, CurrencyItem selectedCurrency, List<List<String>> inventory) {
        showCurrencyName(selectedCurrency);
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
    private void showCurrencyName(CurrencyItem selectedCurrency) {
        System.out.println("Selected currency: " + selectedCurrency.name());
    }

    private void showTable(List<List<String>> inventory) {
        List<Integer> columnWidths = List.of(15, 5, 50, 15);
        List<String> headers = List.of("Product", "Image", "Description", "Price");
        Table table = new Table(headers,inventory, columnWidths);

        table.showData();
    }
}
