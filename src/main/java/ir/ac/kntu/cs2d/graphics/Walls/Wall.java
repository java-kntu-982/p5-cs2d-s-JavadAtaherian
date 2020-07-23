package ir.ac.kntu.cs2d.graphics.Walls;

import javafx.scene.shape.Rectangle;

public class Wall extends Rectangle{
    private Rectangle wall ;

    public Wall(Rectangle wall) {
        this.wall = wall;

    }

    public Rectangle getWall() {
        return wall;
    }
}
