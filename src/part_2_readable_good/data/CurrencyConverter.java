package part_2_readable_good.data;

import part_2_readable_good.utilities.CurrencyItem;

public class CurrencyConverter {
    // Public
    public static String convert(double amount, int currencyIndex) {
        CurrencyItem newCurrency = CurrencyPool.getItemById(currencyIndex);
        String newSymbol = newCurrency.symbol();
        double newPrice = amount * newCurrency.exchangeRate();

        return newSymbol + newPrice;
    }
}
