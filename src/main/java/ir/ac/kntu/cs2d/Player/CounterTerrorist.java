package ir.ac.kntu.cs2d.Player;

import ir.ac.kntu.cs2d.inventory.gun.colt.Colt;
import ir.ac.kntu.cs2d.inventory.gun.colt.Glock;
import ir.ac.kntu.cs2d.inventory.gun.colt.USP;
import ir.ac.kntu.cs2d.inventory.gun.rifle.Rifle;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class CounterTerrorist extends Player{
    public CounterTerrorist(String name) {
        super(725, 215, 725, 215, new USP(), null, name, 100, 800, new Circle());
        this.getShape().setCenterX(this.getSpawnX());
        this.getShape().setCenterY(this.getSpawnY());
        this.getShape().setRadius(5);
        this.getShape().setFill(Color.DARKGREEN);
    }

    @Override
    public void setColt(Colt colt) {
        super.setColt(colt);
    }

    @Override
    public void setRifle(Rifle rifle) {
        super.setRifle(rifle);
    }
}
