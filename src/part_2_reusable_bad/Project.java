package part_2_reusable_bad;

public class Project {
    // Constructor
    public Project() {
        ProjectModel model = new ProjectModel();
        ProjectView view = new ProjectView(model.getSelectedCurrencyIndex());
        ProjectController controller = new ProjectController(model, view);

        controller.requestInput();
    }
}
