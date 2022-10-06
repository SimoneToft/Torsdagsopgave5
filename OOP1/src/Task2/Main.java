package Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Room room1 = new Room(1,5,3);
        Room room2 = new Room(2,4,2);
        Room room3 = new Room(3,7,5);
        ArrayList<Room> rooms =new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building1 = new Building(rooms,2,2,false);

    }
    public static int countLampsInBuilding(Building building1){
        int totalLamps=0;
        for(Room r: building1.getRooms()){
            totalLamps+=r.getNumberOfLamps();
        }
        return totalLamps;
    }
    public static boolean isNormal(Building building1){
        if(building1.getRooms().size()<building1.getNumberOfFloors()) {
            return true;
        }
        else{
            System.out.println("This is an odd building");
            return false;
        }
    }
}

