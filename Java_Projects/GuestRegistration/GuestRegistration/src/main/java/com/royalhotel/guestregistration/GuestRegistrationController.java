package com.royalhotel.guestregistration;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.*;

public class GuestRegistrationController {
    @FXML
    protected TextField usernameTextField;
    @FXML
    protected PasswordField passwordPasswordField;
    @FXML
    protected Label IncorrectText;
    @FXML
    protected Label successLoginText;


    @FXML
    public void onLoginButtonClick(ActionEvent actionEvent) {
        String username = usernameTextField.getText();
        String password = passwordPasswordField.getText();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?profileSQL=true", "root", "");

            PreparedStatement st = connection.prepareStatement("Select username, password from employee_login where username=? and password=?");//sec ok

            st.setString(1, username);
            st.setString(2, password);
           ResultSet rs = st.executeQuery();
           if(rs.next()){
               successLoginText.setText("Login Success.");
           } else {
               IncorrectText.setText("Incorrect Username & Password");
           }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

    }
    @FXML
    public void onNewUserButtonClick(ActionEvent actionEvent) {
        String username = usernameTextField.getText();
        String password = passwordPasswordField.getText();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?profileSQL=true", "root", "");

            PreparedStatement st = connection.prepareStatement("insert into employee_login (id, username, password) values (?, ?, ?)");

            st.setInt(1, 2);
            st.setString(2, username);
            st.setString(3, password);
            st.execute();

            connection.close();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}