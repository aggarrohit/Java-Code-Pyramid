package part_2_reusable_bad;

import part_2_reusable_bad.data.Currencies;

public class ProjectModel {
    // Properties
    private int selectedCurrencyIndex = 0;

    // Getters
    public int getSelectedCurrencyIndex() {
        return selectedCurrencyIndex;
    }

    // Setter
    public void setSelectedCurrencyIndex(int proposedIndex) {
        if (Currencies.getCurrencies().size() >= proposedIndex) {
            this.selectedCurrencyIndex = proposedIndex - 1;
        }
        else {
            throw new IndexOutOfBoundsException();
        }
    }
}
