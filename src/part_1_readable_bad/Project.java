/**
 * Note:
 * This file is excluded is not formatted on purpose to compare the lack of formatting.
 * It also ignores the code enhancement that Intelli-J idea suggest.
 * To see the difference, create a new branch and format the code and click on the warning icon on the top right.
 */

package part_1_readable_bad;

import java.util.List;

public class Project {
    String GLOBAL_CURRENCY = "usd";
    // inventory
    List<Invoice> invoices = List.of(new Invoice("Flashlight", "🔦", "A really great flashlight", 100, 1, "usd"),
            new Invoice("Tin can", "🥫", "Pretty much what you would expect from a tin can", 32, 2, "usd"),
            new Invoice("Cardboard Box", "📦", "It holds things", 5, 3, "usd"));

    public Project() {
        System.out.println("1 Readable Bad ❌");
        System.out.println("Global currency: " + GLOBAL_CURRENCY);
        String format = "| %-15s | %-5s | %-50s | %-5d |%n";
        printSeparatorLine();
        System.out.format("| Product         | Image | Description                                        | Price |%n");
        printSeparatorLine();
        printInvoices(format);
        printSeparatorLine();
    }

    private static void printSeparatorLine() {
        System.out.format("+-----------------+-------+----------------------------------------------------+-------+%n");
    }

    private void printInvoices(String format) {
        for (Invoice invoice : invoices) {
            System.out.format(format, invoice.product(), invoice.image(), invoice.description(), invoice.price());
        }
    }
}