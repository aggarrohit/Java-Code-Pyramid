package part_2_readable_good;

public class Project {
    // Constructor
    public Project() {
        ProjectModel model = new ProjectModel();
        ProjectView view = new ProjectView(model.getCurrencies(), model.getInventory(), model.getCurrencyIndex());
        ProjectController controller = new ProjectController(model, view);

        controller.requestInput();
    }
}
