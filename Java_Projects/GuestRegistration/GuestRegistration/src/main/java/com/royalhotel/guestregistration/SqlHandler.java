package com.royalhotel.guestregistration;

import java.sql.*;

public class SqlHandler {


    public static boolean loginQuery(String username, String password){

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?profileSQL=true", "root", "JUSTin2892!@#$");

            PreparedStatement st = connection.prepareStatement("Select username, password from employee_login where username=? and password=?");

            st.setString(1, username);
            st.setString(2, password);
            ResultSet rs = st.executeQuery();

            return rs.next();

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();

            return false;
        }
    }


    public static void newUserQuery(String username, String password) {
        int id = 1;
        while (!SqlHandler.loginQuery(username, password) && (!username.isBlank() && !password.isBlank())) {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?profileSQL=true", "root", "JUSTin2892!@#$");

                PreparedStatement st = connection.prepareStatement("insert into employee_login (id, username, password) values (?, ?, ?)");

                st.setInt(1, id);
                st.setString(2, username);
                st.setString(3, password);
                st.execute();

                connection.close();
                break;
            } catch (SQLException sqlException) {
                sqlException.printStackTrace();

            } id += 1;
        }

    }


}
