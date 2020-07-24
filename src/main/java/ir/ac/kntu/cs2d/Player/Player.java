package ir.ac.kntu.cs2d.Player;

import ir.ac.kntu.cs2d.inventory.gun.colt.Colt;
import ir.ac.kntu.cs2d.inventory.gun.rifle.Rifle;
import javafx.scene.shape.Circle;

public class Player extends Circle{
    private int spawnX ;
    private int spawnY ;
    private int currentX;
    private int currentY;
    private Colt colt;
    private Rifle rifle;
    private String name ;
    private int health ;
    private int money;
    private Circle shape ;

    public Player(int spawnX, int spawnY, int currentX, int currentY, Colt colt, Rifle rifle, String name, int health, int money, Circle shape) {
        this.spawnX = spawnX;
        this.spawnY = spawnY;
        this.currentX = currentX;
        this.currentY = currentY;
        this.colt = colt;
        this.rifle = rifle;
        this.name = name;
        this.health = health;
        this.money = money;
        this.shape = shape;
    }

    public Circle getShape() {
        return shape;
    }

    public int getSpawnX() {
        return spawnX;
    }

    public int getSpawnY() {
        return spawnY;
    }

    public int getCurrentX() {
        return currentX;
    }

    public int getCurrentY() {
        return currentY;
    }

    public Colt getColt() {
        return colt;
    }

    public Rifle getRifle() {
        return rifle;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getMoney() {
        return money;
    }

    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }

    public void setColt(Colt colt) {
        this.colt = colt;
    }

    public void setRifle(Rifle rifle) {
        this.rifle = rifle;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
