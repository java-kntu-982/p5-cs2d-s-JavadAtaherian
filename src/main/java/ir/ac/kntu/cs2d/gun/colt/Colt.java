package ir.ac.kntu.cs2d.gun.colt;

public class Colt {
    private int price;
    private int damage ;
    private int fireDuration;   //ms
    private int reloadDuration; //ms
    private int MagCapacity;

    public Colt(int price, int damage, int fireDuration, int reloadDuration, int magCapacity) {
        this.price = price;
        this.damage = damage;
        this.fireDuration = fireDuration;
        this.reloadDuration = reloadDuration;
        MagCapacity = magCapacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getFireDuration() {
        return fireDuration;
    }

    public void setFireDuration(int fireDuration) {
        this.fireDuration = fireDuration;
    }

    public int getReloadDuration() {
        return reloadDuration;
    }

    public void setReloadDuration(int reloadDuration) {
        this.reloadDuration = reloadDuration;
    }

    public int getMagCapacity() {
        return MagCapacity;
    }

    public void setMagCapacity(int magCapacity) {
        MagCapacity = magCapacity;
    }
}
