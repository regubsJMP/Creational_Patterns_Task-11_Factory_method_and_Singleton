package com.gubaidullin;

import java.sql.*;

/**
 * Created by Renat_Gubaidullin on 7/10/2016.
 */
public class DBConnection {

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/test";
    private static final String user = "root";
    private static final String password = "root";

    // JDBC variables for opening and managing connection
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    String query = "select count(*) from books";

    public ResultSet createConnection(String query){

        try {
            // opening database connection to MySQL server
            con = DriverManager.getConnection(url, user, password);

            // getting Statement object to execute query
            stmt = con.createStatement();

            // executing SELECT query
            rs = stmt.executeQuery(query);



        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rs;
    }
}
