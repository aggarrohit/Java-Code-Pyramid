package part_2_hope_is_better;

import part_2_hope_is_better.data.CurrencyPool;
import part_2_hope_is_better.data.InventoryPool;
import part_2_hope_is_better.utilities.CurrencyItem;
import part_2_hope_is_better.utilities.InventoryItem;

import java.util.List;

public class ProjectModel {
    // Properties
    private final List<InventoryItem> inventory = InventoryPool.getInventory();
    private final List<CurrencyItem> currencies = CurrencyPool.getCurrencies();
    private int selectedCurrencyId = 0;

    // Getters
    public int getSelectedCurrencyId() {
        return selectedCurrencyId;
    }

    public List<InventoryItem> getInventory() {
        return inventory;
    }

    public List<CurrencyItem> getCurrencies() {
        return currencies;
    }

    // Setters
    // In the future, we will check if the number send by the user matches a currency in the CurrencyPool
}
