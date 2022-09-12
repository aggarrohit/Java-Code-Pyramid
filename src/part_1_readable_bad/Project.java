/**
 * Note:
 * This file is excluded is not formatted on purpose to compare the lack of formatting.
 * It also ignores the code enhancement that Intelli-J idea suggest.
 * To see the difference, create a new branch and format the code and click on the warning icon on the top right.
 */

package part_1_readable_bad;

import java.util.List;

public class Project {
    String c = "usd"; // currency
    // inventory
    List<Inv> inv = List.of(new Inv("Flashlight", "🔦", "A really great flashlight", 100, 1, "usd"),
     new Inv("Tin can", "🥫", "Pretty much what you would expect from a tin can", 32, 2, "usd"),
     new Inv("Cardboard Box", "📦", "It holds things", 5, 3, "usd"));

    public Project() {
        System.out.println("1 Readable Bad ❌");
        System.out.println("Global currency: " + c);
        String format = "| %-15s | %-5s | %-50s | %-5d |%n";
        System.out.format("+-----------------+-------+----------------------------------------------------+-------+%n");
        System.out.format("| Product         | Image | Description                                        | Price |%n");
        System.out.format("+-----------------+-------+----------------------------------------------------+-------+%n");
        for (int i = 0; i < inv.size(); i++) {
            System.out.format(format, inv.get(i).product(), inv.get(i).img(), inv.get(i).desc(), inv.get(i).price());
        }
        System.out.format("+-----------------+-------+----------------------------------------------------+-------+%n");
    }
}
