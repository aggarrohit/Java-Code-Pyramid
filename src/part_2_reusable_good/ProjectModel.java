package part_2_reusable_good;

import part_2_reusable_good.data.PoolCurrency;
import part_2_reusable_good.data.PoolInventory;
import part_2_reusable_good.utilities.ItemCurrency;
import part_2_reusable_good.utilities.ItemInventory;

import java.util.List;
import java.util.NoSuchElementException;

public class ProjectModel {
    // Properties
    private final List<ItemCurrency> currencies = PoolCurrency.getCurrencies();
    private final List<ItemInventory> inventory = PoolInventory.getInventory();
    private ItemCurrency selectedCurrency = currencies.get(0);

    // Getters
    public List<ItemInventory> getInventory() {
        return inventory;
    }

    public List<ItemCurrency> getCurrencies() {
        return currencies;
    }

    public ItemCurrency getSelectedCurrency() {
        return selectedCurrency;
    }

    // Setter
    public void setSelectedCurrency(int selectedOption) throws NoSuchElementException {
        selectedCurrency = PoolCurrency.getItemById(selectedOption);
    }
}
