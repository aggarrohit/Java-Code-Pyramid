package part_2_readable_good.utilities;

import part_2_readable_good.data.CurrencyPool;

public class CurrencyConverter {
    // Public
    public static String convert(double amount, int newCurrencyId) {
        CurrencyItem newCurrency = CurrencyPool.getItemById(newCurrencyId);
        String newSymbol = newCurrency.symbol();
        double newPrice = amount * newCurrency.exchangeRate();

        return newSymbol + newPrice;
    }
}
