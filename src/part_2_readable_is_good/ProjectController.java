package part_2_readable_is_good;

import java.util.NoSuchElementException;
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

            model.setSelectedCurrency(selectedOption);
            view.showData(model.getCurrencies(), model.getSelectedCurrency(), model.getInventory());
        }
        catch (NumberFormatException | NoSuchElementException exception) {
            view.showError();
        }

        view.showPrompt();
        requestInput();
    }
}
