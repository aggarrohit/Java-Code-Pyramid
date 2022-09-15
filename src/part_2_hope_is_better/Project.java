package part_2_hope_is_better;

public class Project {
    // Constructor
    public Project() {
        ProjectModel model = new ProjectModel();
        ProjectView view = new ProjectView(model.getSelectedCurrencyId(), model.getCurrencies(), model.getInventory());
        ProjectController controller = new ProjectController(model, view);

        controller.requestInput();
    }
}
