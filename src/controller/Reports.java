package controller;

import DAO.AnimalDAO;
import DAO.AppointmentDAO;
import DAO.VetTechDAO;
import helper.SceneChange;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Appointment;
import model.VetTech;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ResourceBundle;

/**
 * Reports class
 *
 * @author Megan Riffey
 */
public class Reports implements Initializable {
    @FXML
    private TableView<Appointment> appointTypeTable;
    @FXML
    private TableView<Appointment> appointMonthTable;
    @FXML
    private TableView countryTable;
    @FXML
    private Tab vetTechTab;
    @FXML
    private Tab breedTab;
    @FXML
    private TableColumn<Object, Object> animalBreeds;
    @FXML
    private TableColumn<Object, Object> breedTotal;
    @FXML
    private TableView<model.Animal> breedTable;
    @FXML
    private TableColumn<Appointment, String> appointTotalType;
    @FXML
    private TableColumn<Appointment, Integer> appointTypeTotal;
    @FXML
    private TableColumn<Appointment, String> appointMonth;
    @FXML
    private TableColumn<Appointment, Integer> appointMonthTotal;
    @FXML
    private TableColumn<Appointment, Integer> appointId;
    @FXML
    private TableColumn<Appointment, String> appointTitle;
    @FXML
    private TableColumn<Appointment, String> appointDescription;
    @FXML
    private TableColumn<Appointment, Integer> appointContact;
    @FXML
    private TableColumn<Appointment, String> appointType;
    @FXML
    private TableColumn<Appointment, Timestamp> appointStart;
    @FXML
    private TableColumn<Appointment, Timestamp> appointEnd;
    @FXML
    private TableColumn<Appointment, Integer> appointCustId;
    @FXML
    private TableColumn<Appointment, Integer> appointUserId;
    @FXML
    private ComboBox<VetTech> contactCombo;
    @FXML
    private TableColumn appointCountry;
    @FXML
    private TableColumn appointCountryTotal;
    @FXML
    private Button backToMenu;
    @FXML
    private TableView<Appointment> contactTable;
    MenuBar menuBar;
//    SceneChange sceneChange = new SceneChange();
    // ObservableList that has all contacts from the database
    ObservableList<VetTech> contactList = VetTechDAO.getAllTechs();

    /**
     * Initializing Report tables and setting placeholders when no content is available in tables.
     *
     * @param url            URL
     * @param resourceBundle ResourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Contact Table, setting contact list combo, placeholder message and refreshing table between contacts
        contactCombo.setItems(contactList);
        contactCombo.setVisibleRowCount(10);
        contactTable.setPlaceholder(new Label("Please select a contact."));
        appointId.setCellValueFactory(new PropertyValueFactory<>("appointmentId"));
        appointTitle.setCellValueFactory(new PropertyValueFactory<>("appointmentTitle"));
        appointDescription.setCellValueFactory(new PropertyValueFactory<>("appointmentDescription"));
        appointContact.setCellValueFactory(new PropertyValueFactory<>("appointmentTechName"));
        appointStart.setCellValueFactory(new PropertyValueFactory<>("appointmentStart"));
        appointEnd.setCellValueFactory(new PropertyValueFactory<>("appointmentEnd"));
        appointCustId.setCellValueFactory(new PropertyValueFactory<>("appointmentCustomerId"));
        appointType.setCellValueFactory(new PropertyValueFactory<>("appointmentType"));
        appointUserId.setCellValueFactory(new PropertyValueFactory<>("appointmentUserId"));
        contactTable.refresh();

        // Appointments by Month and Totals for "Appointment Totals" tab
        appointMonthTable.setItems(AppointmentDAO.getAppointmentTypeMonth());
        appointMonthTable.setPlaceholder(new Label("No data for month is available."));
        appointMonth.setCellValueFactory(new PropertyValueFactory<>("appointmentType"));
        appointMonthTotal.setCellValueFactory(new PropertyValueFactory<>("appointmentTypeTotal"));

        // Appointment Type Table and Totals for "Appointment Totals" tab
        appointTypeTable.setPlaceholder(new Label("No data for Type is available."));
        appointTypeTable.setItems(AppointmentDAO.appointmentType());
        appointTotalType.setCellValueFactory(new PropertyValueFactory<>("appointmentType"));
        appointTypeTotal.setCellValueFactory(new PropertyValueFactory<>("appointmentTypeTotal"));

        breedTable.setItems(AnimalDAO.breedTotals());
        breedTable.setPlaceholder(new Label("No data for Breeds is available at this time."));
        breedTotal.setCellValueFactory(new PropertyValueFactory<>("breedTotal"));
        animalBreeds.setCellValueFactory(new PropertyValueFactory<>("animalBreed2"));
    }

    /**
     * Method to populate contacts and to display associated appointments in table. Also displays if no appointments exist
     * for selected contact
     *
     * @param actionEvent event to populate associated appointments when contact is selected
     * @throws SQLException addresses unhandled SQL exception
     */
    public void contactPopulate(ActionEvent actionEvent) throws SQLException {
        // Getting contact name and converting it to contact ID to obtain associated appointments
        String techName = String.valueOf(contactCombo.getValue());
        int techId = VetTechDAO.returnVetTech(techName);
        if (AppointmentDAO.getTechAppointment(techId).isEmpty()) {
            contactTable.setPlaceholder(new Label(techName + " has no appointments."));
            contactTable.refresh();
            for (int i = 0; i < contactTable.getItems().size(); i++) {
                contactTable.getItems().clear();
                contactTable.setPlaceholder(new Label(techName + " has no appointments."));
            }
        } else {
            contactTable.setItems(AppointmentDAO.getTechAppointment(techId));
        }
    }

    public void customerScreen(ActionEvent actionEvent) throws IOException {
        SceneChange.sceneChange.customerScreenChange(actionEvent);
    }

    public void animalScreen(ActionEvent actionEvent) throws IOException {
        SceneChange.sceneChange.animalScreenChange(actionEvent);
    }

    public void appointmentScreen(ActionEvent actionEvent) throws IOException {
        SceneChange.sceneChange.appointmentScreenChange(actionEvent);
    }

    public void reportsScreen(ActionEvent actionEvent) throws IOException {
        SceneChange.sceneChange.reportsScreenChange(actionEvent);
    }
}