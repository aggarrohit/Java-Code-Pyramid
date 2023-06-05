package part_2_reusable_bad.utilities;

import part_2_reusable_bad.data.Currencies;

public class CurrencyConverter {
    public static String convertCurrency(double amount, int currencyIndex) {
        CurrencyItem newCurrency = Currencies.getCurrencies().get(currencyIndex);
        String newSymbol = newCurrency.symbol();
        double newPrice = amount * newCurrency.exchangeRate();

        return newSymbol + newPrice;
    }
}
