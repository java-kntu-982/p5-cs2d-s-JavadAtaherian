package ir.ac.kntu.cs2d.gun.rifle;

public class P90 extends Rifle{
    final int ID = 0; // -1 for T , 0 for both , 1 for CT


    public P90() {
        super(2350, 11, 80, 3300, 50);
    }

    public int getID() {
        return ID;
    }
}
