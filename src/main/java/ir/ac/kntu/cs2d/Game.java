package ir.ac.kntu.cs2d;

import ir.ac.kntu.cs2d.Player.Player;
import ir.ac.kntu.cs2d.graphics.Map.ReadMap;
import javafx.application.Application;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Game extends Application {
    ArrayList<Rectangle> mapData ;
    public static Player player ;

    @Override
    public void start(Stage stage) throws Exception {
        mapData  = new ReadMap().readMap();




    }
}
