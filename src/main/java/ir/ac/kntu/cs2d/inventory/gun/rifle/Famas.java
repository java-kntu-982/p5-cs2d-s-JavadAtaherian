package ir.ac.kntu.cs2d.inventory.gun.rifle;

public class Famas extends Rifle{
    final int ID = 0; // -1 for T , 0 for both , 1 for CT

    public Famas() {
        super(2250, 14, 120, 3300, 25);
    }

    public int getID() {
        return ID;
    }
}
