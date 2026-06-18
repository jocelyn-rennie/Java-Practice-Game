import java.util.ArrayList;
public class Room {
    private String name;
    private String description;
    private ArrayList<Item> items;

    public Room(String name, String description, ArrayList<Item> items) {
        this.name = name;
        this.description = description;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return description;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public Item pickupItem() {
        if (items.isEmpty()) {
            System.out.println("No items in room");
            return null;
        } else {
            Item item = items.get(0);
            items.remove(0);
            return item;

        }
    }
}
