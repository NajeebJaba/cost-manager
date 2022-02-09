package cost.manager.ViewModel;

import cost.manager.utils;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDao {
    //variable to store the connection status
    private Connection db;
    //variable to store the database handler class object
    private dbHandler dbh;

    //constructor for the LoginDao class
    public LoginDao() {
        try {
            dbh = new dbHandler();
            this.db = dbh.getConnection();

        } catch (Exception e) {

        }
    }

    //method to for closing the database connection 
    public void close() {
        try {
            db.close();
        } catch (Exception e) {

        }
    }

    //method for signin in the user by the provided data i.e. email and password
    //if the user found then logs in else shows the error message
    public boolean Login(String email, String password) {
        String sql = "SELECT * FROM users where email='" + email + "' and password = '" + password + "'";

        try {
            Statement stmt = db.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                utils.writeDate("session.txt", String.valueOf(rs.getInt("_id")));

                return true;
            }
            return false;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
