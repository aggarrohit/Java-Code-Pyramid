package part_2_reusable_good;

import part_2_reusable_good.utilities.CurrencyConverter;
import part_2_reusable_good.utilities.DropDownMenu;
import part_2_reusable_good.utilities.ItemCurrency;
import part_2_reusable_good.utilities.ItemInventory;
import part_2_reusable_good.utilities.Table;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectView {
    // Constructor
    public ProjectView(List<ItemCurrency> currencies, ItemCurrency selectedCurrency, List<ItemInventory> inventory) {
        showData(currencies, selectedCurrency, inventory);
    }

    // Public
    public void showData(List<ItemCurrency> currencies, ItemCurrency selectedCurrency, List<ItemInventory> inventory) {
        generateDropDownMenu(currencies, selectedCurrency);
        generateTable(inventory, selectedCurrency);
        showPrompt();
    }

    public void showError() {
        System.out.println("⚠️ Invalid option");
    }

    public void showPrompt() {
        System.out.print("Choose an option and then press enter: ");
    }

    // Private
    private void generateDropDownMenu(List<ItemCurrency> currencies, ItemCurrency selectedCurrency) {
        List<String> currencyNames = parsedCurrencyNames(currencies);
        DropDownMenu dropDownMenu = new DropDownMenu("Available currencies", currencyNames);

        System.out.println("Selected currency: " + selectedCurrency.name());
        dropDownMenu.showData();
    }

    private void generateTable(List<ItemInventory> inventory, ItemCurrency selectedCurrency) {
        List<Integer> columnWidths = List.of(15, 5, 50, 10);
        List<String> headers = List.of("Product", "Image", "Description", "Price");
        List<List<String>> body = parseInventory(inventory, selectedCurrency);
        Table table = new Table(columnWidths, headers, body);

        table.showData();
    }

    private List<List<String>> parseInventory(List<ItemInventory> inventory, ItemCurrency selectedCurrency) {
        List<List<String>> result = new ArrayList<>();

        for (ItemInventory item: inventory) {
            String name = item.name();
            String image = item.image();
            String description = item.description();
            String price = CurrencyConverter.convert(item.price(), selectedCurrency);
            List<String> data = List.of(name, image, description, price);

            result.add(data);
        }

        return result;
    }

    private List<String> parsedCurrencyNames(List<ItemCurrency> currencies) {
        return currencies.stream().map(ItemCurrency::name).collect(Collectors.toList());
    }
}
