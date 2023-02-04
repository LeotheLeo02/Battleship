package battleship.ships;

public class AirCraftCarrier extends Ships {

    public AirCraftCarrier(String[] coordinates){
        super.name = "AirCraft Carrier";
        super.health = 5;
        super.coordinates = coordinates;
    }
}

