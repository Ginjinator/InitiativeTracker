package Controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import java.util.ArrayList;

public class ControllerMain {

    @FXML private ListView charactersList;
    private ArrayList<String> characters = new ArrayList<>();

    public void initialize () {
        ObservableList obList = FXCollections.observableList(characters);
    }

}
