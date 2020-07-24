package ir.ac.kntu.cs2d.graphics.Map;

import ir.ac.kntu.cs2d.graphics.Walls.*;
import javafx.scene.shape.Rectangle;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class ReadMap /*extends Application */{
    ArrayList<ArrayList<Integer>> mapData = new ArrayList<>();
    ArrayList<Rectangle> walls = new ArrayList<>();


    public ArrayList<Rectangle> readMap() throws Exception {
//        Group root = new Group();
//        Scene scene = new Scene(root , 1000,1000);
        try(BufferedReader reader = new BufferedReader(new FileReader(new File("src/main/resources/maps/Map1.txt")))){
            String line ;
            while ( (line = reader.readLine()) != null){
                ArrayList<Integer> temp = new ArrayList<>();
                for(int i=0;i<line.length();i++){
                    temp.add(Integer.parseInt(String.valueOf(line.charAt(i))));

                }
                mapData.add(temp);
            }
        } catch (Exception ignored){}

        for (int i = 0; i < mapData.size(); i++) {
            for(int j=0;j<mapData.get(i).size();j++){
                switch ((mapData.get(i).get(j))){
                    case 0:
                        NotAWall temp = new NotAWall(j * 5 , i * 5);
                        walls.add(temp.getWall());break;
                    case 1:
                        CreamWall creamWall = new CreamWall(j * 5 , i * 5);
                        walls.add(creamWall.getWall());break;

                    case 2:
                        OrangeWall orangeWall = new OrangeWall(j * 5 , i * 5);
                        walls.add(orangeWall.getWall());break;

                    case 3:
                        Box box = new Box(j * 5 , i * 5);
                        walls.add(box.getWall());break;

                    case 5:
                        CTSpawn ctSpawn = new CTSpawn(j * 5 , i * 5);
                        walls.add(ctSpawn.getWall());break;

                    case 6:
                        TSpawn tSpawn = new TSpawn(j * 5 , i * 5);
                        walls.add(tSpawn.getWall());break;

                    case 9:
                        BombSite bombSite = new BombSite(j * 5 , i * 5);
                        walls.add(bombSite.getWall());break;
                }
            }
        }

//        root.getChildren().addAll(walls);
//
//        stage.setScene(scene);

        return walls;

    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }

}



