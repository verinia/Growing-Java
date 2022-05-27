package com.royalhotel.guestregistration;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class CreateNewUserController {
    public Label errorLabel;
    public Label successLabel;
    public Button backButton;
    @FXML
    private TextField createUsernameField;
    @FXML
    private PasswordField createPasswordField;

    @FXML
    public static void main(String[] args) {


    }
    @FXML
    public void onCreateUserButton(ActionEvent actionEvent) {

        if (!createUsernameField.getText().isBlank() && !createPasswordField.getText().isBlank()){
            errorLabel.setText(" ");
            successLabel.setText(" ");
            if(SqlHandler.loginQuery(createUsernameField.getText(), createPasswordField.getText())) {
                errorLabel.setText(" ");
                errorLabel.setText("            User login already exists");

            } else {
                errorLabel.setText(" ");

                SqlHandler.newUserQuery(createUsernameField.getText(), createPasswordField.getText());
                successLabel.setText("Login Created");
                createUsernameField.setText("");
                createPasswordField.setText("");
            }

        } else if (createUsernameField.getText().isBlank() && createPasswordField.getText().isBlank()) {

            errorLabel.setText("Please Create a Username and Password");
        }

    }
    @FXML
    public void onBackButton(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage) backButton.getScene().getWindow();
        stage.close();


    }
}
