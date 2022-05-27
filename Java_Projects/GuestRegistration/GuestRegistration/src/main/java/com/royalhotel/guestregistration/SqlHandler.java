package com.royalhotel.guestregistration;

import java.sql.*;

public class SqlHandler {


    public static void loginQuery(String username, String password){

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?profileSQL=true", "root", "");

            PreparedStatement st = connection.prepareStatement("Select username, password from employee_login where username=? and password=?");//sec ok

            st.setString(1, username);
            st.setString(2, password);
            st.executeQuery();
            System.out.println("Login Successful");



        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
            System.out.println("Login Failed");

        }
    }


    public void newUserQuery(String username, String password){
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
