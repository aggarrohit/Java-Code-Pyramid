package part_2_readable_is_good;

import part_2_readable_is_good.data.CurrencyConverter;
import part_2_readable_is_good.utilities.CurrencyItem;
import part_2_readable_is_good.utilities.DropDownMenu;
import part_2_readable_is_good.utilities.InventoryItem;
import part_2_readable_is_good.utilities.Table;

import java.util.ArrayList;
import java.util.List;

public class ProjectView {
    // Constructor
    public ProjectView(List<CurrencyItem> currencies, CurrencyItem selectedCurrency, List<InventoryItem> inventory) {
        showData(currencies, selectedCurrency, inventory);
    }

    // Public
    public void showError() {
        System.out.println("⚠️ Invalid option");
    }

    public void showPrompt() {
        System.out.print("Choose an option and then press enter: ");
    }

    public void showData(List<CurrencyItem> currencies, CurrencyItem selectedCurrency, List<InventoryItem> inventory) {
        showCurrencyName(currencies, selectedCurrency);
        showTable(inventory, selectedCurrency);
        showPrompt();
    }

    // Private
    private void showCurrencyName(List<CurrencyItem> currencies, CurrencyItem selectedCurrency) {
        List<String> currencyNames = parsedCurrencyNames(currencies);
        DropDownMenu dropDownMenu = new DropDownMenu("Available currencies", currencyNames);

        System.out.println("Selected currency: " + selectedCurrency.name());
        dropDownMenu.showData();
    }

    private void showTable(List<InventoryItem> inventory, CurrencyItem selectedCurrency) {
        List<Integer> columnWidths = List.of(15, 5, 50, 10);
        List<String> headers = List.of("Product", "Image", "Description", "Price");
        List<List<String>> body = parseInventory(inventory, selectedCurrency);
        Table table = new Table(columnWidths, headers, body);

        table.showData();
    }

    private List<List<String>> parseInventory(List<InventoryItem> inventory, CurrencyItem selectedCurrency) {
        List<List<String>> result = new ArrayList<>();

        for (InventoryItem item: inventory) {
            String name = item.name();
            String image = item.image();
            String description = item.description();
            String price = CurrencyConverter.convert(item.price(), selectedCurrency.id());
            List<String> data = List.of(name, image, description, price);

            result.add(data);
        }

        return result;
    }

    private List<String> parsedCurrencyNames(List<CurrencyItem> currencies) {
        List<String> result = new ArrayList<>();

        for (CurrencyItem item: currencies) {
            String name = item.name();

            result.add(name);
        }

        return result;
    }
}
