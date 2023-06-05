package part_2_readable_good.data;

import part_2_readable_good.utilities.ItemInventory;

import java.util.List;
import java.util.NoSuchElementException;

public class PoolInventory {
    // Properties
    private final static List<ItemInventory> inventory = List.of(
            new ItemInventory(0,"Flashlight", "🔦", "A really great flashlight", 100.00, "usd"),
            new ItemInventory(1,"Tin can", "🥫", "Pretty much what you would expect from a tin can", 32.00, "usd"),
            new ItemInventory(2,"Cardboard Box", "📦", "It holds things", 5.00, "usd")
    );

    // Getter
    public static List<ItemInventory> getInventory() {
        return inventory;
    }

    // Public
    // ❌ REFACTOR THIS IS DRY!!!
    public static ItemInventory getItemById(int requestedId) throws NoSuchElementException{
        ItemInventory result = null;

        for (ItemInventory item : inventory) {
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
