package battleship.ships;

public class Ship {
    int health;

    String[] coordinates;

    public Ship(String [] coordinates, int health) {
        this.coordinates = coordinates;
        this.health = health;
    }
}
