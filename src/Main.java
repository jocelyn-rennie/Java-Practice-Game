import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Item> items1 = new ArrayList<>();
        Room room1 = new Room("room1", "",items1);
        ArrayList<Room> rooms  = new ArrayList<>();
        Game game = new Game(rooms, room1);
        int command = 0;

        while(true){
            System.out.println("Welcome to the Room Game");
            System.out.println("Enter a command");

            while(true) {
                try {
                    command = input.nextInt();
                    break;
                } catch (Exception e) {
                    input.nextLine();
                    System.out.println("Invalid command");
                }
            }

            if(command == 1){
                break;
            }

        }
    }
}