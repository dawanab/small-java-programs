/*  Create a single room of a house using composition.
    Think about the things that should be included in the room.
    Maybe physical parts of the house but furniture as well
    Add at least one method to access an object via a getter and
    then that objects public method.
    then add at least one method to hide the object e.g. not using a getter
    but to access the object used in composition within the main class */

public class Main {

    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("West");

        Ceiling ceiling = new Ceiling(12, "Scarlet Red");
        Bed bed = new Bed("California King", 6, 12, 1000, false);
        Lamp lamp = new Lamp("Electric", false, 100);
        Bedroom bedRoom = new Bedroom("Only Way", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();
    }
    
}
