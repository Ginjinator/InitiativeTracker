package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class ControllerStartScreen {

    private ArrayList<String> characters;
    private String characterNameFile = "CharactersNames.txt";
    private String characterNamePath = "C:/Users/erike/IdeaProjects/IntiativeTracker/CharacterNames.txt";

    @FXML
    public void getNames(ActionEvent event) throws IOException {
        //ArrayList<String> oldCharacters = getCharacters();
        Controller.loadScreen("MainTracker.fxml", event);
    }

    @FXML
    public void createNames(ActionEvent event) throws IOException {

    }

    @FXML
    public void addNames(ActionEvent event) throws IOException {

    }

    public ArrayList<String> getCharacters() throws IOException{
        this.setCharacters();
        return characters;
    }

    public void setCharacters() throws IOException {
        Scanner scanner = new Scanner(new File(characterNamePath));
        characters = new ArrayList<String>();
        while (scanner.hasNext()) {
            characters.add(scanner.next());
        }
        scanner.close();
    }
}
