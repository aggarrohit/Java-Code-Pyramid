package part_2_readable_is_good.data;

import part_2_readable_is_good.utilities.CurrencyItem;

import java.util.List;
import java.util.NoSuchElementException;

public class CurrencyPool {
    // Properties
    private final static List<CurrencyItem> currencies = List.of(
            new CurrencyItem(1,"usd", "$", 1.00),
            new CurrencyItem(2, "rupee", "₹", 66.78),
            new CurrencyItem(3, "yuan", "元", 6.87)
    );

    // Getters
    public static List<CurrencyItem> getCurrencies() {
        return currencies;
    }

    // Public
    // ❌ REFACTOR THIS IS DRY!!!
    public static CurrencyItem getItemById(int requestedId) throws NoSuchElementException {
        CurrencyItem result = null;

        for (CurrencyItem item : currencies) {
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
