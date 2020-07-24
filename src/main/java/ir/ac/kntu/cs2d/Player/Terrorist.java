package ir.ac.kntu.cs2d.Player;


import ir.ac.kntu.cs2d.inventory.gun.colt.Colt;
import ir.ac.kntu.cs2d.inventory.gun.colt.Glock;
import ir.ac.kntu.cs2d.inventory.gun.rifle.Rifle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Terrorist extends Player{
    public Terrorist(String name) {
        super(725, 90, 725, 90, new Glock(), null, name, 100, 800, new Circle());
        this.getShape().setCenterX(this.getCurrentX());
        this.getShape().setCenterY(this.getCurrentY());
        this.getShape().setRadius(5);
        this.getShape().setFill(Color.TOMATO);

    }

    @Override
    public void setRifle(Rifle rifle) {
        super.setRifle(rifle);
    }

    @Override
    public void setColt(Colt colt) {
        super.setColt(colt);
    }
}
