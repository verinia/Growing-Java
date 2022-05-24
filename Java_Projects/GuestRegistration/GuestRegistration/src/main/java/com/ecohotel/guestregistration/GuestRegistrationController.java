package com.ecohotel.guestregistration;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GuestRegistrationController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}