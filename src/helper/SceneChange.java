package helper;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneChange {
    public static SceneChange sceneChange = new SceneChange();
    public void customerScreenChange(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../view/Customers.fxml")));
        sceneParent(actionEvent, parent);
    }

    public void animalScreenChange(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../view/Animals.fxml")));
        sceneParent(actionEvent, parent);
    }

    private void sceneParent(ActionEvent actionEvent, Parent parent) {
        Scene scene = new Scene(parent);
        parent.getStylesheets().add(Objects.requireNonNull(this.getClass().getResource("/test.css")).toExternalForm());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    public void sceneClose(ActionEvent actionEvent){
        Stage stage = (Stage) ((Button) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    public void appointmentScreenChange(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../view/Appointments.fxml")));
        sceneParent(actionEvent, parent);
    }

    public void reportsScreenChange(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../view/Reports.fxml")));
        sceneParent(actionEvent, parent);
    }



}
