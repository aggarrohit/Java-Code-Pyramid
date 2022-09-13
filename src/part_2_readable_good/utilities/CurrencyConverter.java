package part_2_readable_good.utilities;

import part_2_readable_good.data.Currencies;

public class CurrencyConverter {
    // Public
    public static String convertCurrency(double amount, int currencyIndex) {
        CurrencyItem newCurrency = Currencies.getCurrencies().get(currencyIndex);
        String newSymbol = newCurrency.symbol();
        double newPrice = amount * newCurrency.exchangeRate();

        return newSymbol + newPrice;
    }
}
