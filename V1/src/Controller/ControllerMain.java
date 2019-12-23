package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.io.IOException;
import java.util.ArrayList;

public class ControllerMain {

    @FXML private ListView charactersList;
    private ArrayList<String> characters = new ArrayList<>();

    public void initialize () throws IOException {
        Controller controller = new Controller();
        characters = controller.getCharacters();
        ObservableList obList = FXCollections.observableList(characters);
        this.charactersList.setItems(obList);
        this.charactersList.setVisible(true);

    }

}
