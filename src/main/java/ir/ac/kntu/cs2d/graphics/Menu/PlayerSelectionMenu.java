package ir.ac.kntu.cs2d.graphics.Menu;

import ir.ac.kntu.cs2d.Game;
import ir.ac.kntu.cs2d.Player.CounterTerrorist;
import ir.ac.kntu.cs2d.Player.Terrorist;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class PlayerSelectionMenu extends Application {

    private Parent createContent() {
        Pane root = new Pane();

        root.setPrefSize(1280, 768);

        try (InputStream is = Files.newInputStream(Paths.get("./src/main/resources/images/choose-player.jpg"))) {
            ImageView img = new ImageView(new Image(is));
            img.setFitWidth(1280);
            img.setFitHeight(768);
            img.setOpacity(50);
            root.getChildren().add(img);
        } catch (IOException e) {
            System.out.println("Couldn't load image");
        }

        Title title = new Title("choose player" , 405 , 60);
        title.setTranslateX(452);
        title.setTranslateY(50);

        Title title4 = new Title("B A C K" , 250 , 60);
        title4.setTranslateX(500);
        title4.setTranslateY(700);

        Title title2 = new Title("Counter Terrorist" , 550 , 550);
        title2.setTranslateX(80);
        title2.setTranslateY(140);

        Title title3 = new Title("Terrorist" , 550 , 550);
        title3.setTranslateX(640);
        title3.setTranslateY(140);

//        StackPane imgContainer1 = new StackPane();
//        StackPane imgContainer2 = new StackPane();

//        File file = new File("./src/main/resources/images/counter-terrorist.jpg");
//        Image ctImage= new Image(file.toURI().toString());
//
//        File file2 = new File("./src/main/resources/images/terrorist.png");
//        Image tImage= new Image(file2.toURI().toString());
//
//        ImageView CTimage = new ImageView(ctImage);
//        ImageView Timage = new ImageView(tImage);
//
//        CTimage.setFitHeight(350);
//        CTimage.setFitHeight(350);
//        Timage.setFitHeight(400);
//        Timage.setFitWidth(400);
//        Timage.setX(690);
//        Timage.setY(140);
//        CTimage.setX(80);
//        CTimage.setY(140);









        root.getChildren().addAll(title, title2 , title3 , title4 );

        return root;

    }

    @Override
    public void start(Stage primaryStage2) throws Exception {
        Scene scene = new Scene(createContent());
        primaryStage2.setTitle("CS2D (store)");
        primaryStage2.setScene(scene);
        primaryStage2.show();


    }

    private static class Title extends StackPane {
        public Title(String name , int width , int length) {

            LinearGradient gradient = new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, new Stop[]{
                    new Stop(0, Color.DARKRED),
                    new Stop(0.1, Color.BLACK),
                    new Stop(0.9, Color.BLACK),
                    new Stop(1, Color.DARKRED)

            });

            Rectangle bg = new Rectangle(width, length);
            bg.setStroke(Color.DARKRED);
            bg.setStrokeWidth(2);
            bg.setFill(null);

            Text text = new Text(name);
            text.setFill(Color.BLACK);
            text.setFont(Font.font("Times New Roman", FontWeight.SEMI_BOLD, 50));

            setAlignment(Pos.CENTER);
            getChildren().addAll(bg, text);

            setOnMouseEntered( event -> {
                bg.setFill(gradient);
                text.setFill(Color.WHITE);
            });

            setOnMouseExited(event -> {
                bg.setFill(null);
                text.setFill(Color.BLACK);
            });

            setOnMouseClicked( event -> {
                if (name.equals("Terrorist")) {
                    ((Node) (event.getSource())).getScene().getWindow().hide();
                    System.out.println("Enter your name :");
                    Scanner scanner = new Scanner(System.in);
                    String theName = scanner.nextLine();
                    scanner.close();
                    Game.player = new Terrorist(theName);
                    System.out.println(Game.player.toString());
                }

                if (name.equals("Counter Terrorist")) {
                    ((Node) (event.getSource())).getScene().getWindow().hide();
                    System.out.println("Enter your name :");
                    Scanner scanner = new Scanner(System.in);
                    String theName = scanner.nextLine();
                    scanner.close();
                    Game.player = new CounterTerrorist(theName);
                    System.out.println(Game.player.toString());
                }

            });




        }
    }







    public static void main(String[] args) {
        launch(args);
    }
}
