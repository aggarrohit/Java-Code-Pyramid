package part_2_readable_bad.data;

import part_2_readable_bad.utilities.InventoryItem;

import java.util.List;

public class Inventory {
    // Properties
    private static final List<InventoryItem> inventory = List.of(
            new InventoryItem(0,"Flashlight", "🔦", "A really great flashlight", 100.00, "usd"),
            new InventoryItem(1,"Tin can", "🥫", "Pretty much what you would expect from a tin can", 32.00, "usd"),
            new InventoryItem(2,"Cardboard Box", "📦", "It holds things", 5.00, "usd")
    );

    // Getters
    public static List<InventoryItem> getInventory() {
        return inventory;
    }
}
