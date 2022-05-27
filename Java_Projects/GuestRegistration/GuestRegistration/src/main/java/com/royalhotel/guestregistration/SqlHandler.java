package com.royalhotel.guestregistration;

import java.sql.*;

public class SqlHandler {


    public static void loginQuery(String username, String password){



        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?profileSQL=true", "root", "");

            PreparedStatement st = connection.prepareStatement("Select username, password from employee_login where username=? and password=?");

            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();
            if(rs.next()){
                System.out.println("Login Success");
            } else {
                System.out.println("Login Failed");
            }



        } catch (SQLException sqlException) {
            sqlException.printStackTrace();


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
