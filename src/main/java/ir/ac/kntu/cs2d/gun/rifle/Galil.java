package ir.ac.kntu.cs2d.gun.rifle;

public class Galil extends Rifle{
    final int ID = -1; // -1 for T , 0 for both , 1 for CT

    public Galil() {
        super(2000, 13, 120, 2600, 35);
    }

    public int getID() {
        return ID;
    }
}
