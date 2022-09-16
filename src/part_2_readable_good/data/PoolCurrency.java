package part_2_readable_good.data;

import part_2_readable_good.utilities.ItemCurrency;

import java.util.List;
import java.util.NoSuchElementException;

public class PoolCurrency {
    // Properties
    private final static List<ItemCurrency> currencies = List.of(
            new ItemCurrency(1,"usd", "$", 1.00),
            new ItemCurrency(2, "rupee", "₹", 66.78),
            new ItemCurrency(3, "yuan", "元", 6.87)
    );

    // Getters
    public static List<ItemCurrency> getCurrencies() {
        return currencies;
    }

    // Public
    // ❌ REFACTOR DRY
    public static ItemCurrency getItemById(int requestedId) throws NoSuchElementException {
        ItemCurrency result = null;

        for (ItemCurrency item : currencies) {
            int id = item.id();

            if (id == requestedId) {
                result = item;
            }
        }

        // Safeguard
        if (result == null) {
            throw new NoSuchElementException();
        }

        return result;
    }
}
