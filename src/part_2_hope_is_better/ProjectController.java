package part_2_hope_is_better;

import java.util.Scanner;

public class ProjectController {
    // Properties
    private final ProjectModel model;
    private final ProjectView view;
    private final Scanner scanner;

    // Constructor
    public ProjectController(ProjectModel model, ProjectView view) {
        this.model = model;
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    // Public
    public void requestInput() {
        String input = scanner.nextLine();

        try {
            int selectedOption = Integer.parseInt(input.trim());

            System.out.println("DEBUG: " + selectedOption);
        }
        catch (NumberFormatException exception) {
            view.showError();
        }

        view.showPrompt();
        requestInput();
    }
}
