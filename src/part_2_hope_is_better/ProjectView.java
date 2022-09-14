package part_2_hope_is_better;

public class ProjectView {
    // Constructor
    public ProjectView(int selectedCurrencyId) {
        System.out.println("Selected currency id: " + selectedCurrencyId);
        System.out.println("Inventory table:");
        System.out.println("🗓 (placeholder)");
        showPrompt();
    }

    // Public
    public void showError() {
        System.out.println("⚠️ Invalid option");
    }

    public void showPrompt() {
        System.out.print("Choose between dollars, rupees, or yuan's: ");
    }
}
