package sample;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    static Stage stage;
    static Timeline timeline;
    static Symulation symulation;



    @Override
    public void start(Stage primaryStage) throws Exception{

    stage = primaryStage;
    stage.setTitle("ant");


    timeline.getKeyFrames().addAll(new KeyFrame(Duration.seconds(0.1), event -> {

        drawBoard();

    }));

    timeline.setCycleCount(Animation.INDEFINITE);
    timeline.play();


    }

    private void drawBoard() {
        GridPane root = new GridPane();

        for (int x = 0; x < Symulation.GRID_SIZE ; x++) {
            for (int y = 0; y < Symulation.GRID_SIZE ; y++) {
                symulation.grid[x][y].isWhite
            }

        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
