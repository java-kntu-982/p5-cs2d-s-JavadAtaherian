package ir.ac.kntu.cs2d;

import ir.ac.kntu.cs2d.Player.CounterTerrorist;
import ir.ac.kntu.cs2d.Player.Player;
import ir.ac.kntu.cs2d.graphics.Map.ReadMap;
import ir.ac.kntu.cs2d.graphics.Menu.MainMenu;
import ir.ac.kntu.cs2d.graphics.Menu.PlayerSelectionMenu;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.Event;
import javafx.scene.Group;
import javafx.scene.ParallelCamera;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Game extends Application {
    ArrayList<Rectangle> mapData ;
    public static Player player ;

    @Override
    public void start(Stage stage) throws Exception {
        player = new CounterTerrorist("temp");
        Platform.runLater(() -> {
            try {
                new MainMenu().start(new Stage());
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        mapData  = new ReadMap().readMap();
        Group root = new Group();
        Scene scene = new Scene(root , 1000 , 1000);
        ParallelCamera camera = new ParallelCamera();
        camera.setScaleX(0.3);
        camera.setScaleY(0.3);
        stage.setScene(scene);
        scene.setCamera(camera);

        scene.addEventHandler(KeyEvent.KEY_PRESSED , keyEvent ->{
            boolean ismoving = false;
            if (keyEvent.getCode().equals(KeyCode.W)){
                if (player.getCurrentY()>5 && player.getCurrentY()<1995){
                    player.setCurrentY(player.getCurrentY()-5);
                    ismoving = true;
                }
            }else if (keyEvent.getCode().equals(KeyCode.S)){
                if (player.getCurrentY()>5 && player.getCurrentY()<1995){
                    player.setCurrentY(player.getCurrentY()+5);
                    ismoving = true;
                }
            }else if (keyEvent.getCode().equals(KeyCode.A)){
                if (player.getCurrentX()>5 && player.getCurrentX()<1995){
                    player.setCurrentY(player.getCurrentY()-5);
                    ismoving = true;
                }
            }else if (keyEvent.getCode().equals(KeyCode.D)){
                if (player.getCurrentX()>5 && player.getCurrentX()<1995){
                    player.setCurrentY(player.getCurrentY()+5);
                    ismoving = true;
                }
            }else if (keyEvent.getCode().equals(KeyCode.TAB)){
                //new ScoreBoardMenu.start(new stage());
            }

            if (ismoving){
                camera.setTranslateX(player.getShape().getCenterX()-scene.getWidth()*0.12);
                camera.setTranslateY(player.getShape().getCenterY()-scene.getHeight()*0.12);
            }
        });

        root.getChildren().addAll(mapData);
        root.getChildren().addAll(player.getShape());
        root.getChildren().addAll(camera);
        stage.show();













    }

    public static void main(String[] args) {
        launch(args);
    }
}
