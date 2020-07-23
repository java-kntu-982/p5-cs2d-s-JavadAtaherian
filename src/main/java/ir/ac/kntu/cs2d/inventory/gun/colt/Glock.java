package ir.ac.kntu.cs2d.inventory.gun.colt;

public class Glock extends Colt{
    final int ID = -1; // -1 for T , 0 for both , 1 for CT

    public Glock() {
        super(400, 21, 300, 2300, 20);
    }

    public int getID() {
        return ID;
    }


}
