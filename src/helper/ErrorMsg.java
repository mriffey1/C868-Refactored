package helper;

import javafx.fxml.Initializable;
import javafx.scene.control.Alert;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Error Messages class
 *
 * @author Megan Riffey
 */

public class ErrorMsg implements Initializable {
    static ResourceBundle langBundle = ResourceBundle.getBundle("language/lang");

    /**
     * Alerts with alert type error
     *
     * @param whichError associated case number
     */
    public static void getError(int whichError) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        switch (whichError) {

            // Incorrect Username error message alert
            case 1 -> {
                alert.setTitle(langBundle.getString("ErrorUsername"));
                alert.setContentText(langBundle.getString("incorrectUsername"));
                alert.showAndWait();
            }

            // Incorrect Password error message alert
            case 2 -> {
                alert.setTitle(langBundle.getString("ErrorPassword"));
                alert.setContentText(langBundle.getString("incorrectPassword"));
                alert.showAndWait();
            }

            // Incorrect Username and Password alert
            case 3 -> {
                alert.setTitle(langBundle.getString("ErrorUserPass"));
                alert.setContentText(langBundle.getString("incorrectEverything"));
                alert.showAndWait();
            }

            // Deletion of customer confirmation alert
            case 4 -> {
                alert.setTitle("Please confirm deletion");
                alert.setContentText("Please confirm you would like to delete this customer.");
                alert.showAndWait();
            }

            // Username is blank error message alert
            case 5 -> {
                alert.setTitle(langBundle.getString("ErrorBlankUserName"));
                alert.setContentText(langBundle.getString("blankUserName"));
                alert.showAndWait();
            }

            // Password is blank error message alert
            case 6 -> {
                alert.setTitle(langBundle.getString("ErrorBlankPassWord"));
                alert.setContentText(langBundle.getString("blankPassWord"));
                alert.showAndWait();
            }

            // No customer is selected alert
            case 7 -> {
                alert.setTitle("No Selection");
                alert.setContentText("Please select a customer to continue.");
                alert.showAndWait();
            }

            // Title text-field is blank alert
            case 8 -> {
                alert.setTitle("Title is blank");
                alert.setContentText("Please enter a Title.");
                alert.showAndWait();
            }

            // Description text-field is blank alert
            case 9 -> {
                alert.setTitle("Description is blank");
                alert.setContentText("Please enter a description.");
                alert.showAndWait();
            }

            // Type text-field is blank alert
            case 10 -> {
                alert.setTitle("Type is blank");
                alert.setContentText("Please enter a Type.");
                alert.showAndWait();
            }

            // Location text-field is blank alert
            case 11 -> {
                alert.setTitle("Location is blank");
                alert.setContentText("Please enter a Location.");
                alert.showAndWait();
            }

            // No appointment was selected alert
            case 12 -> {
                alert.setTitle("No Appointment Selected");
                alert.setContentText("No appointment was selected.");
                alert.showAndWait();
            }

            // Overlapping appointments alert
            case 13 -> {
                alert.setTitle("Overlapping appointment");
                alert.setContentText("");
                alert.showAndWait();
            }

            // Customer Name is blank alert
            case 14 -> {
                alert.setTitle("Customer Name is blank");
                alert.setContentText("The Customer Name field is blank.\nPlease enter a valid name.");
                alert.showAndWait();
            }

            // Customer address is blank alert
            case 15 -> {
                alert.setTitle("Customer Address is blank");
                alert.setContentText("The Customer Address field is blank.\nPlease enter a valid address.");
                alert.showAndWait();
            }

            // Customer Postal code is blank alert
            case 16 -> {
                alert.setTitle("Customer Postal Code is blank");
                alert.setContentText("The Customer postal code field is blank.\nPlease enter a valid postal code.");
                alert.showAndWait();
            }

            // Division/Country Field is blank alert
            case 17 -> {
                alert.setTitle("Division/Country Field");
                alert.setContentText("Please check the division and country field.");
                alert.showAndWait();
            }

            // Start date picker is empty alert
            case 18 -> {
                alert.setTitle("Please select a valid start date");
                alert.setContentText("The start date field is blank. Please choose a date.");
                alert.showAndWait();
            }

            // Start time combo is empty alert
            case 19 -> {
                alert.setTitle("Please select a valid start time");
                alert.setContentText("The start time is blank. Please choose a start time.");
                alert.showAndWait();
            }

            // End date picker is empty alert
            case 20 -> {
                alert.setTitle("Please select a valid end date");
                alert.setContentText("The end date field is blank. Please choose a date.");
                alert.showAndWait();
            }

            // End time combo is empty alert
            case 21 -> {
                alert.setTitle("Please select a valid end time");
                alert.setContentText("The end time is blank. Please choose an end time.");
                alert.showAndWait();
            }

            // Customer combo is empty alert
            case 22 -> {
                alert.setTitle("Please select a valid customer");
                alert.setContentText("Please select a valid customer.");
                alert.showAndWait();
            }

            // User combo is empty alert
            case 23 -> {
                alert.setTitle("Please select a valid user");
                alert.setContentText("Please select a valid user.");
                alert.showAndWait();
            }

            // Contact combo is empty alert
            case 24 -> {
                alert.setTitle("Please select a valid Vet Tech");
                alert.setContentText("Please select a valid Vet Tech.");
                alert.showAndWait();
            }

            // Phone number field is empty alert
            case 25 -> {
                alert.setTitle("Error: Phone number");
                alert.setContentText("Please enter a valid phone number.");
                alert.showAndWait();
            }
            case 26 -> {
                alert.setTitle("No Selection");
                alert.setContentText("Please select an animal to continue.");
                alert.showAndWait();
            }
            case 27 -> {
                alert.setTitle("Animal Name is Blank");
                alert.setContentText("Please enter an animal name.\n" +
                        "This cannot be blank.");
                alert.showAndWait();
            }
            case 28 -> {
                alert.setTitle("Animal Age is Blank");
                alert.setContentText("Please enter the animal's age.\n" +
                        "This cannot be blank.");
                alert.showAndWait();
            }
            case 29 -> {
                alert.setTitle("Animal Age is invalid");
                alert.setContentText("""
                        The animal age you have entered
                         is invalid. Please enter a valid
                         number.""");
                alert.showAndWait();
            }
            case 30 -> {
                alert.setTitle("Animal Breed is blank");
                alert.setContentText("Please enter an animal breed.\n" +
                        "This cannot be blank.");
                alert.showAndWait();
            }
            case 31 -> {
                alert.setTitle("Animal Weight is invalid");
                alert.setContentText("""
                        The animal weight you have entered
                         is invalid. Please enter a valid
                         number.""");
                alert.showAndWait();
            }
            case 32 -> {
                alert.setTitle("Animal Weight is blank");
                alert.setContentText("Please enter the animal's weight.\n" +
                        "This cannot be blank.");
                alert.showAndWait();
            }
            case 33 -> {
                alert.setTitle("No Selection");
                alert.setContentText("Please select a note to delete.\n");
                alert.showAndWait();
            }
            case 34 -> {
                alert.setTitle("No Selection");
                alert.setContentText("Please select a note to edit.\n");
                alert.showAndWait();
            }
            // Default that throws an error
            default -> throw new IllegalStateException("Unexpected value: " + whichError);
        }
    }

    /**
     * Alerts with alert type: confirmation
     *
     * @param confirm associated case number
     */
    public static void confirmation(int confirm) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        switch (confirm) {

            // No Appointments in the next 15 minutes alert
            case 1 -> {
                alert.setTitle(langBundle.getString("Alert"));
                alert.setContentText(langBundle.getString("Noappointmentswithinthenext15minutes."));
                alert.showAndWait();
            }

            // Customer has successfully been removed alert
            case 2 -> {
                alert.setTitle("Customer has been removed");
                alert.setHeaderText("Success");
                alert.setContentText("Customer has been successfully removed. ");
                alert.showAndWait();
            }

            // Customer has been successfully added alert
            case 3 -> {
                alert.setTitle("Customer has been successfully added");
                alert.setHeaderText("Success");
                alert.setContentText("Customer has been successfully added. ");
                alert.showAndWait();
            }

            // Appointment has been modified alert
            case 4 -> {
                alert.setTitle("Appointment has been successfully modified");
                alert.setHeaderText("Success");
                alert.setContentText("Appointment has been successfully modified. ");
                alert.showAndWait();
            }

            // Appointment successfully added alert
            case 5 -> {
                alert.setTitle("Appointment has been successfully added");
                alert.setHeaderText("Success");
                alert.setContentText("Appointment has been successfully added. ");
                alert.showAndWait();
            }
            case 6 -> {
                alert.setTitle("Note has been successfully modified");
                alert.setHeaderText("Success");
                alert.setContentText("Note has been successfully modified. ");
                alert.showAndWait();
            }
            case 7 -> {
                alert.setTitle("Note has been successfully added");
                alert.setHeaderText("Success");
                alert.setContentText("Note has been successfully added. ");
                alert.showAndWait();
            }
            case 8 -> {
                alert.setTitle("Customer has been successfully modified");
                alert.setHeaderText("Success");
                alert.setContentText("Customer has been successfully modified. ");
                alert.showAndWait();
            }
            case 9 -> {
                alert.setTitle("Animal has been successfully added");
                alert.setHeaderText("Success");
                alert.setContentText("Animal has been successfully added. ");
                alert.showAndWait();
            }
            case 10 -> {
                alert.setTitle("Note has been successfully deleted");
                alert.setHeaderText("Success");
                alert.setContentText("Note has been successfully deleted. ");
                alert.showAndWait();
            }
            case 11 -> {
                alert.setTitle("Animal has been successfully modified");
                alert.setHeaderText("Success");
                alert.setContentText("Animal has been successfully modified. ");
                alert.showAndWait();
            }
            case 12 -> {
                alert.setTitle("Animal has been successfully deleted");
                alert.setHeaderText("Success");
                alert.setContentText("Animal has been successfully deleted. ");
                alert.showAndWait();
            }
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
