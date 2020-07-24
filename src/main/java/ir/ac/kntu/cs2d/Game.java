package ir.ac.kntu.cs2d;

import ir.ac.kntu.cs2d.Player.CounterTerrorist;
import ir.ac.kntu.cs2d.Player.Player;
import ir.ac.kntu.cs2d.graphics.Map.ReadMap;
import ir.ac.kntu.cs2d.graphics.Menu.MainMenu;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.ParallelCamera;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

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
        AtomicBoolean goNorth= new AtomicBoolean(false);
        AtomicBoolean goSouth = new AtomicBoolean(false);
        AtomicBoolean goEast = new AtomicBoolean(false);
        AtomicBoolean goWest = new AtomicBoolean(false);
        AtomicBoolean ismoving = new AtomicBoolean(false);
        AtomicBoolean isrunning = new AtomicBoolean(false);

        scene.addEventHandler(KeyEvent.KEY_PRESSED , keyEvent ->{

            if (keyEvent.getCode().equals(KeyCode.W)){
                if (player.getCurrentY()>5 && player.getCurrentY()<1995){

                    goNorth.set(true);
                    ismoving.set(true);
                }
            }else if (keyEvent.getCode().equals(KeyCode.S)){
                if (player.getCurrentY()>5 && player.getCurrentY()<1995){

                    goSouth.set(true);
                    ismoving.set(true);

                }
            }else if (keyEvent.getCode().equals(KeyCode.A)){
                if (player.getCurrentX()>5 && player.getCurrentX()<1995){

                    goWest.set(true);
                    ismoving.set(true);

                }
            }else if (keyEvent.getCode().equals(KeyCode.D)){
                if (player.getCurrentX()>5 && player.getCurrentX()<1995){

                    goEast.set(true);
                    ismoving.set(true);

                }
            }else if (keyEvent.getCode().equals(KeyCode.SHIFT)) {
                if (player.getCurrentX() > 5 && player.getCurrentX() < 1995) {

                    isrunning.set(true);
                    ismoving.set(true);

                }
            }else if (keyEvent.getCode().equals(KeyCode.TAB)){
                //new ScoreBoardMenu.start(new stage());
            }
        });

            scene.addEventHandler(KeyEvent.KEY_RELEASED , keyEvent2 ->{

                if (keyEvent2.getCode().equals(KeyCode.W)){
                    if (player.getCurrentY()>5 && player.getCurrentY()<1995){
                        goNorth.set(false);
                        ismoving.set(false);
                    }
                }else if (keyEvent2.getCode().equals(KeyCode.S)){
                    if (player.getCurrentY()>5 && player.getCurrentY()<1995){
                        goSouth.set(false);

                    }
                }else if (keyEvent2.getCode().equals(KeyCode.A)){
                    if (player.getCurrentX()>5 && player.getCurrentX()<1995){
                        goWest.set(false);

                    }
                }else if (keyEvent2.getCode().equals(KeyCode.D)){
                    if (player.getCurrentX()>5 && player.getCurrentX()<1995){
                        goEast.set(false);

                    }
                }else if (keyEvent2.getCode().equals(KeyCode.SHIFT)) {
                    if (player.getCurrentX() > 5 && player.getCurrentX() < 1995) {

                        isrunning.set(false);
                        ismoving.set(false);

                    }
                } else if (keyEvent2.getCode().equals(KeyCode.TAB)){
                    //new ScoreBoardMenu.start(new stage());
                }


        });

            if (ismoving.get()){
                camera.setTranslateX(player.getShape().getCenterX()-scene.getWidth()*0.12);
                camera.setTranslateY(player.getShape().getCenterY()-scene.getHeight()*0.12);
            }

        root.getChildren().addAll(mapData);
        root.getChildren().addAll(player.getShape());
        root.getChildren().addAll(camera);
        stage.show();

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                int dx = 0, dy = 0;

                if (goNorth.get()) dy -= 1;
                if (goSouth.get()) dy += 1;
                if (goEast.get())  dx += 1;
                if (goWest.get())  dx -= 1;
                if (isrunning.get()) { dx *= 3; dy *= 3; }

                moveBy(dx, dy);
            }
        };
        timer.start();
    }

    private void moveTo(int x, int y) {

        final int cx = player.getCurrentX();
        final int cy = player.getCurrentY();

        if (x - cx >= 5 &&
                x + cx <= 995 &&
                y - cy >= 5 &&
                y + cy <= 995) {

            player.relocate(x - cx, y - cy);

        }
    }

    private void moveBy(int dx, int dy) {
        if (dx == 0 && dy == 0) return;

        int x = player.getCurrentX() +  dx;
        int y =  player.getCurrentY() + dy;

        moveTo(x, y);
    }








    public static void main(String[] args) {
        launch(args);
    }
}
