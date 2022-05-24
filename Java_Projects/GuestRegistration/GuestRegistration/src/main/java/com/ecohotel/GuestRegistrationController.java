package com.ecohotel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class GuestRegistrationController {
    public PasswordField loginPasswordField;
    public TextField loginUsernameField;
    @FXML
    public void onLoginClick(ActionEvent actionEvent) {
        String loginUsername = loginUsernameField.getText();
        String loginPassword = loginPasswordField.getText();
    }
    @FXML

    public void onRegistrationClick(ActionEvent actionEvent) {

    }
}