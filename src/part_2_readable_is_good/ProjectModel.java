package part_2_readable_is_good;

import part_2_readable_is_good.data.CurrencyPool;
import part_2_readable_is_good.data.InventoryPool;
import part_2_readable_is_good.utilities.CurrencyItem;
import part_2_readable_is_good.utilities.InventoryItem;

import java.util.List;
import java.util.NoSuchElementException;

public class ProjectModel {
    // Properties
    private final List<CurrencyItem> currencies = CurrencyPool.getCurrencies();
    private final List<InventoryItem> inventory = InventoryPool.getInventory();
    private CurrencyItem selectedCurrency = currencies.get(0);

    // Getters
    public List<InventoryItem> getInventory() {
        return inventory;
    }

    public List<CurrencyItem> getCurrencies() {
        return currencies;
    }

    public CurrencyItem getSelectedCurrency() {
        return selectedCurrency;
    }

    // Setter
    public void setSelectedCurrency(int selectedOption) throws NoSuchElementException {
        selectedCurrency = CurrencyPool.getItemById(selectedOption);
    }
}
