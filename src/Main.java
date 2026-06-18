import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        ArrayList<Item> items1 = new ArrayList<>();
        Room room1 = new Room("room1", "",items1);
        ArrayList<Room> rooms  = new ArrayList<>();
        Game game = new Game(rooms, room1);

    }
}