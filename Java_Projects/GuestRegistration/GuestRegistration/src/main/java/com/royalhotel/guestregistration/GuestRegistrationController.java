package com.royalhotel.guestregistration;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
;

public class GuestRegistrationController {
    @FXML
    protected TextField usernameTextField;
    @FXML
    protected PasswordField passwordPasswordField;
    @FXML
    protected Label incorrectText;
    @FXML
    protected Label successLoginText;

    @FXML
    public void onLoginButtonClick(ActionEvent actionEvent) {

        String username = usernameTextField.getText();
        String password = passwordPasswordField.getText();
        SqlHandler.loginQuery(username,password);


    }
    @FXML
    public void onNewUserButtonClick(ActionEvent actionEvent) {
        String username = usernameTextField.getText();
        String password = passwordPasswordField.getText();
    }

    public void onBackButton(ActionEvent actionEvent) {
    }

    public void onCreateUserButton(ActionEvent actionEvent) {
    }
}