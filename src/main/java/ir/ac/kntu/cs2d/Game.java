package ir.ac.kntu.cs2d;

import ir.ac.kntu.cs2d.Player.Player;
import ir.ac.kntu.cs2d.graphics.Map.ReadMap;
import ir.ac.kntu.cs2d.graphics.Menu.MainMenu;
import ir.ac.kntu.cs2d.graphics.Menu.PlayerSelectionMenu;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Game extends Application {
    ArrayList<Rectangle> mapData ;
    public static Player player ;

    @Override
    public void start(Stage stage) throws Exception {
        Platform.runLater(() -> {
            try {
                new MainMenu().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        mapData  = new ReadMap().readMap();







    }

    public static void main(String[] args) {
        launch(args);
    }
}
