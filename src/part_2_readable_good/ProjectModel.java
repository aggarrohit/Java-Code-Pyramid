package part_2_readable_good;

import part_2_readable_good.data.Currencies;

public class ProjectModel {
    // Properties
    private int selectedCurrencyIndex = 0;

    // Getters
    public int getSelectedCurrencyIndex() {
        return selectedCurrencyIndex;
    }

    // Setter
    public void setSelectedCurrencyIndex(int selectedCurrencyIndex) {
        if (Currencies.getCurrencies().size() < selectedCurrencyIndex) {
            this.selectedCurrencyIndex = selectedCurrencyIndex - 1;
        }
    }
}
