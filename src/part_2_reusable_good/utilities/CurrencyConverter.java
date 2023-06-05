package part_2_reusable_good.utilities;

public class CurrencyConverter {
    public static String convert(double amount, ItemCurrency newCurrency) {
        String newSymbol = newCurrency.symbol();
        double newPrice = amount * newCurrency.exchangeRate();

        return newSymbol + newPrice;
    }
}
