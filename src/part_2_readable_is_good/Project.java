package part_2_readable_is_good;

public class Project {
    // Constructor
    public Project() {
        ProjectModel model = new ProjectModel();
        ProjectView view = new ProjectView(model.getSelectedCurrencyName(), model.getInventory());
        ProjectController controller = new ProjectController(model, view);

        controller.requestInput();
    }
}
