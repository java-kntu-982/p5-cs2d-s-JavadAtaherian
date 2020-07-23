package ir.ac.kntu.cs2d.gun.colt;

public class USP extends Colt{
    final int ID = 1; // -1 for T , 0 for both , 1 for CT


    public USP() {
        super(500, 24, 340, 2200, 12);
    }

    public int getID() {
        return ID;
    }

}
