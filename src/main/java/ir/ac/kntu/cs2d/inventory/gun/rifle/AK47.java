package ir.ac.kntu.cs2d.inventory.gun.rifle;

public class AK47 extends Rifle{
    final int ID = -1; // -1 for T , 0 for both , 1 for CT


    public AK47() {
        super(2500, 22, 120, 2500, 30);
    }

    public int getID() {
        return ID;
    }
}
