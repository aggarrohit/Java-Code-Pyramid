package part_2_readable_is_good.data;

import part_2_readable_is_good.utilities.InventoryItem;

import java.util.List;
import java.util.NoSuchElementException;

public class InventoryPool {
    // Properties
    private final static List<InventoryItem> inventory = List.of(
            new InventoryItem(0,"Flashlight", "🔦", "A really great flashlight", 100.00, "usd"),
            new InventoryItem(1,"Tin can", "🥫", "Pretty much what you would expect from a tin can", 32.00, "usd"),
            new InventoryItem(2,"Cardboard Box", "📦", "It holds things", 5.00, "usd")
    );

    // Getter
    public static List<InventoryItem> getInventory() {
        return inventory;
    }

    // Public
    // ❌ REFACTOR THIS IS DRY!!!
    public static InventoryItem getItemById(int requestedId) throws NoSuchElementException{
        InventoryItem result = null;

        for (InventoryItem item : inventory) {
            int id = item.id();

            if (id == requestedId) {
                result = item;
            }
        }

        // Safeguard
        if (result == null) {
            throw new NoSuchElementException();
        }

        return result;
    }
}
