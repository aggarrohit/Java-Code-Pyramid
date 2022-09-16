package part_2_readable_good.utilities;

import java.util.List;

public class CurrencySelector {
    // Properties
    private final List<CurrencyItem> currencies;

    // Constructor
    public CurrencySelector(List<CurrencyItem> currencies) {
        this.currencies = currencies;
    }

    // Public
    public void showData() {
        StringBuilder options = new StringBuilder();
        String result;

        for (CurrencyItem item: currencies) {
            String id = String.valueOf(item.id());
            String name = item.name();

            options.append(id).append(". ").append(name).append(", ");
        }
        result = "Choose between: " + options + "and then press enter: ";

        System.out.print(result);
    }
}
