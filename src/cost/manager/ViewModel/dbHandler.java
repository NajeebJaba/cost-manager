package cost.manager.ViewModel;

import java.sql.*;

public class dbHandler {

    //variable to store the url to the database 
    private String dbURL = "jdbc:sqlite:cost-manager.db";
    //intializing the database connection to null;
    private Connection conn = null;

    //constructor for dbHandler class
    public dbHandler() {
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(dbURL);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
//method for returning the connection
    public Connection getConnection() {
        return this.conn;
    }



}
