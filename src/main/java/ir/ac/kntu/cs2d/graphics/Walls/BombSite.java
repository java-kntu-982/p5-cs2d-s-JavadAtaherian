package ir.ac.kntu.cs2d.graphics.Walls;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BombSite extends Wall{
    public BombSite(int x , int y) {
        super(new Rectangle());
        this.getWall().setX(x);
        this.getWall().setY(y);
        this.getWall().setHeight(5);
        this.getWall().setWidth(5);
        this.getWall().setFill(Color.RED);
    }
}
