package controller;

import DAO.NoteDAO;
import helper.SceneChange;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

public class NoteAdd extends AnimalModify implements Initializable {

    @FXML
    private TextArea addNoteField;
    @FXML
    private TextField addNoteId;
    @FXML
    private int animalId;
    @FXML
    private int id;
    @FXML
    private Label animalIdLabel;
    String animalIdField;
    int usrname;
    int value2;
    Button addSaveBtn;

//    SceneChange sceneChange = new SceneChange();
    ObservableList<Integer> list = FXCollections.observableArrayList();

    public void setAnimalId(int usrname) {
        animalIdLabel.setText(String.valueOf(usrname));
        list.add(usrname);
    }

    public void addSaveBtn(ActionEvent actionEvent) throws SQLException {
        String notes = addNoteField.getText();
        LocalDateTime createdDate = LocalDateTime.now();
        LocalDateTime lastUpdated = LocalDateTime.now();
        NoteDAO.addNote(notes, createdDate, lastUpdated, list.get(usrname));
        helper.ErrorMsg.confirmation(7);
        SceneChange.sceneChange.sceneClose(actionEvent);

    }

    public void addCancelBtn(ActionEvent actionEvent) {
        SceneChange.sceneChange.sceneClose(actionEvent);
    }

    @FXML
    public void handleCloseButtonAction(ActionEvent actionEvent) {
        SceneChange.sceneChange.sceneClose(actionEvent);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


}
