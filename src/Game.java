import java.util.ArrayList;

public class Game {
    ArrayList<Room> rooms = new ArrayList<Room>();
    Room currentRoom;

    public Game(ArrayList<Room> rooms, Room currentRoom){
        this.rooms = rooms;
        this.currentRoom = currentRoom;
    }

    public Room getCurrentRoom(){
        return currentRoom;
    }
}

