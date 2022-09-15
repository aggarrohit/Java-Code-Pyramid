package part_2_readable_is_good;

import part_2_readable_is_good.data.CurrencyPool;
import part_2_readable_is_good.data.InventoryPool;
import part_2_readable_is_good.utilities.CurrencyItem;
import part_2_readable_is_good.utilities.InventoryItem;

import java.util.ArrayList;
import java.util.List;

public class ProjectModel {
    // Properties
    private final List<List<String>> inventory = parseInventory();
    private final List<CurrencyItem> currencies = CurrencyPool.getCurrencies();
    private String selectedCurrencyName = currencies.get(0).name();

    // Getters
    public List<List<String>> getInventory() {
        return inventory;
    }

    public List<CurrencyItem> getCurrencies() {
        return currencies;
    }

    public String getSelectedCurrencyName() {
        return selectedCurrencyName;
    }

    // Setters
    // In the future, we will check if the number send by the user matches a currency in the CurrencyPool

    // Private
    private List<List<String>> parseInventory() {
        List<List<String>> result = new ArrayList<>();

        for (InventoryItem item: InventoryPool.getInventory()) {
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
