package part_2_readable_bad.data;

import part_2_readable_bad.utilities.CurrencyItem;

import java.util.List;

public class Currencies {
    // Properties
    private static final List<CurrencyItem> currencies = List.of(
            new CurrencyItem("usd", "$", 1.00),
            new CurrencyItem( "rupee", "₹", 66.78),
            new CurrencyItem( "yuan", "元", 6.87),
            new CurrencyItem( "swedish krona", "SEK", 9.81),
            new CurrencyItem( "sucres", "S./", 25000.00)
    );

    // Getters
    public static List<CurrencyItem> getCurrencies() {
        return currencies;
    }
}
