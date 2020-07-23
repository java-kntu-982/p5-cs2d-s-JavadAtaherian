package ir.ac.kntu.cs2d.gun.rifle;

public class M4A1 extends Rifle{
    final int ID = 1; // -1 for T , 0 for both , 1 for CT

    public M4A1() {
        super(3100, 22, 120, 3100, 30);
    }

    public int getID() {
        return ID;
    }
}
