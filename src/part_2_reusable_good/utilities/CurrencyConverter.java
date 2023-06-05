package part_2_readable_good.utilities;

public class CurrencyConverter {
    // Public
    public static String convert(double amount, ItemCurrency newCurrency) {
        String newSymbol = newCurrency.symbol();
        double newPrice = amount * newCurrency.exchangeRate();

        return newSymbol + newPrice;
    }
}
