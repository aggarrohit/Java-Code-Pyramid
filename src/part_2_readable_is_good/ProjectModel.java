package part_2_readable_is_good;

import part_2_readable_is_good.data.CurrencyPool;
import part_2_readable_is_good.data.InventoryPool;
import part_2_readable_is_good.utilities.CurrencyConverter;
import part_2_readable_is_good.utilities.CurrencyItem;
import part_2_readable_is_good.utilities.InventoryItem;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ProjectModel {
    // Properties
    private final List<CurrencyItem> currencies = CurrencyPool.getCurrencies();
    private CurrencyItem selectedCurrency = currencies.get(0);
    private List<List<String>> inventory = parseInventory();

    // Getters
    public List<List<String>> getInventory() {
        return inventory;
    }

    public List<CurrencyItem> getCurrencies() {
        return currencies;
    }

    public CurrencyItem getSelectedCurrency() {
        return selectedCurrency;
    }

    // Public
    public void handleOption(int selectedOption) throws NoSuchElementException {
        selectedCurrency = CurrencyPool.getItemById(selectedOption);
        inventory = parseInventory();
    }

    // Private
    private List<List<String>> parseInventory() {
        List<InventoryItem> pool = InventoryPool.getInventory();
        List<List<String>> result = new ArrayList<>();

        for (InventoryItem item: pool) {
            String name = item.name();
            String image = item.image();
            String description = item.description();
            String price = CurrencyConverter.convert(item.price(), selectedCurrency.id());
            List<String> data = List.of(name, image, description, price);

            result.add(data);
        }

        return result;
    }
}
