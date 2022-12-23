package controller;

import DAO.NoteDAO;
import helper.SceneChange;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Note;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

public class NoteModify implements Initializable {
    @FXML
    private TextArea notesModify;
    @FXML
    private TextField modifyNoteId;
    int usrname;
//    SceneChange sceneChange = new SceneChange();
    ObservableList<Integer> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    public void getNoteInfoModify(Note note) {
        modifyNoteId.setText(Integer.toString(note.getNoteId()));
        notesModify.setText(note.getNotes());
    }

    public void setAnimalId(int usrname) {
        //   animalIdLabel.setText(String.valueOf(usrname));
        list.add(usrname);
    }

    public void modifySaveBtn(ActionEvent actionEvent) {
        int id = Integer.parseInt(modifyNoteId.getText());
        String notes = notesModify.getText();
        LocalDateTime lastUpdated = LocalDateTime.now();
        NoteDAO.updateNote(id, notes, lastUpdated, list.get(usrname));
        helper.ErrorMsg.confirmation(6);
        SceneChange.sceneChange.sceneClose(actionEvent);
    }


}
