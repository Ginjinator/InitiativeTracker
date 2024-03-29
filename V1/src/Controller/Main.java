package Controller;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Controller.loadScreen("StartScreen.fxml", stage);
    }

    public static void main (String[] args) {
        launch(args);
    }
}
