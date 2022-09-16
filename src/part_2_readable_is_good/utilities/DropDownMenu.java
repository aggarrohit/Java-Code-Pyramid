package part_2_readable_is_good.utilities;

import java.util.List;

public class DropDownMenu {
    // Properties
    private final String title;
    private final List<String> options;

    // Constructor
    public DropDownMenu(String title, List<String> options) {
        this.title = title;
        this.options = options;
    }

    // Public
    public void showData() {
        generateTitle(title);
        generateOptions(options);
    }

    // Private
    private void generateTitle(String title) {
        String postfix = ": ";

        System.out.print(title + postfix);
    }

    private void generateOptions(List<String> options) {
        StringBuilder result = new StringBuilder();

        for (int index = 0; index < options.size(); index++) {
            int number = index + 1;
            String name = options.get(index);

            result.append(number).append(". ").append(name).append(", ");
        }

        System.out.println(result);
    }
}
