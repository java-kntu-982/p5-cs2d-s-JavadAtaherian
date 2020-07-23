package ir.ac.kntu.cs2d.inventory.gun.rifle;

public class Rifle {
    private int price;
    private int damage ;
    private int fireDuration;   //ms
    private int reloadDuration; //ms
    private int MagCapacity;

    public Rifle(int price, int damage, int fireDuration, int reloadDuration, int magCapacity) {
        this.price = price;
        this.damage = damage;
        this.fireDuration = fireDuration;
        this.reloadDuration = reloadDuration;
        MagCapacity = magCapacity;
    }

    public int getPrice() {
        return price;
    }

    public int getDamage() {
        return damage;
    }

    public int getFireDuration() {
        return fireDuration;
    }

    public int getReloadDuration() {
        return reloadDuration;
    }

    public int getMagCapacity() {
        return MagCapacity;
    }
}
