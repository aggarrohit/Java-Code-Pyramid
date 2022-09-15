package part_2_readable_is_good;

import part_2_readable_is_good.data.CurrencyPool;
import part_2_readable_is_good.data.InventoryPool;
import part_2_readable_is_good.utilities.CurrencyItem;
import part_2_readable_is_good.utilities.InventoryItem;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class ProjectModel {
    // Properties
    private final List<List<String>> inventory = parseInventory();
    private final List<CurrencyItem> currencies = CurrencyPool.getCurrencies();
    private String currencyName = currencies.get(0).name();

    // Getters
    public List<List<String>> getInventory() {
        return inventory;
    }

    public List<CurrencyItem> getCurrencies() {
        return currencies;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    // Setter
    public void setCurrencyName(int selectedOption) throws NoSuchElementException {
        CurrencyItem currency = CurrencyPool.getItemById(selectedOption);
        currencyName = currency.name();
    }

    // Private
    private List<List<String>> parseInventory() {
        List<InventoryItem> pool = InventoryPool.getInventory();
        List<List<String>> result = new ArrayList<>();

        for (InventoryItem item: pool) {
            String name = item.name();
            String image = item.image();
            String description = item.description();
            String price = item.price().toString();
            List<String> data = List.of(name, image, description, price);

            result.add(data);
        }

        return result;
    }
}
