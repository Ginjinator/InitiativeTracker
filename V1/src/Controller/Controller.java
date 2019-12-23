package Controller;

import View.View;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Controller implements Initializable {

    private static ArrayList<String> characters;
    private static String characterNameFile = "CharactersNames.txt";
    private static String characterNamePath = "C:/Users/erike/IdeaProjects/IntiativeTracker/CharacterNames.txt";

    public static void loadScreen(String parent, ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(View.class.getResource(parent));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public static void loadScreen(String parent, Stage stage) throws IOException {
        Parent root = FXMLLoader.load(View.class.getResource(parent));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public static void loadCenterPane(String parent, Pane pane) throws IOException {
        ((BorderPane) pane.getParent()).setCenter(FXMLLoader.load(View.class.getResource(parent)));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public static ArrayList<String> getCharacters() throws IOException{
        setCharacters();
        return characters;
    }

    public static void setCharacters() throws IOException {
        Scanner scanner = new Scanner(new File(characterNamePath));
        characters = new ArrayList<String>();
        while (scanner.hasNext()) {
            characters.add(scanner.next());
        }
        scanner.close();
    }
}
