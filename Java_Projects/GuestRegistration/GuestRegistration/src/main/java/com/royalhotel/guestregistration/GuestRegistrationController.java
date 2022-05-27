package com.royalhotel.guestregistration;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

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
    public void onNewUserButtonClick(ActionEvent actionEvent){
        try {
            Stage stage = new Stage();
            FXMLLoader fxmlLoader = new FXMLLoader();
            Pane root = fxmlLoader.load(Objects.requireNonNull(getClass().getResource("CreateNewUser.fxml")).openStream());
            stage.setScene(new Scene(root,700,488));
            stage.setResizable(false);
            stage.setTitle("Registration");
            stage.showAndWait();
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}