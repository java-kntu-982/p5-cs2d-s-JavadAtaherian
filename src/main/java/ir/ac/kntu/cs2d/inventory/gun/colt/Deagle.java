package ir.ac.kntu.cs2d.inventory.gun.colt;

public class Deagle extends Colt{
    final int ID = 0; // -1 for T , 0 for both , 1 for CT


    public Deagle() {
        super(650, 34, 550, 2200, 7);
    }

    public int getID() {
        return ID;
    }
}
