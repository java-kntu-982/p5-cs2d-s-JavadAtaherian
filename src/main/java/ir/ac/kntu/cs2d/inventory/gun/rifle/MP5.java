package ir.ac.kntu.cs2d.inventory.gun.rifle;

public class MP5 extends Rifle{
    final int ID = 0; // -1 for T , 0 for both , 1 for CT


    public MP5() {
        super(1500, 13, 120, 3100, 30);
    }

    public int getID() {
        return ID;
    }
}
