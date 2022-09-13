package part_2_readable_good;


import part_2_readable_good.utilities.CurrencyItem;
import part_2_readable_good.utilities.InventoryItem;

import java.util.List;

public class ProjectModel {
    // Properties
    private final List<CurrencyItem> currencies = List.of(
            new CurrencyItem(0, "usd", "$"),
            new CurrencyItem(1, "rupee", "₹"),
            new CurrencyItem(2, "yuan", "元")
    );
    private final List<InventoryItem> inventory = List.of(
            new InventoryItem(0,"Flashlight", "🔦", "A really great flashlight", 100, "usd"),
            new InventoryItem(1,"Tin can", "🥫", "Pretty much what you would expect from a tin can", 32, "usd"),
            new InventoryItem(2,"Cardboard Box", "📦", "It holds things", 5, "usd")
    );
    private int currencyIndex = 0;

    // Getters
    public int getCurrencyIndex() {
        return currencyIndex;
    }

    public List<CurrencyItem> getCurrencies() {
        return currencies;
    }

    public List<InventoryItem> getInventory() {
        return inventory;
    }
}
