package cost.manager.ViewModel;
import cost.manager.Model.user;
import java.sql.*;
import javax.swing.JOptionPane;

public class RegisterDao {
    //variable to store the database connection
    private Connection db;
//variable to store the dbHandler class object
    private dbHandler dbh;

    //consturctor for the Register Dao class
    public RegisterDao() {
        try {
            dbh = new dbHandler();
            this.db = dbh.getConnection();

        } catch (Exception e) {

        }
    }

    //method for registering new user u to the database
    public boolean Register(user u) {
        try {
            if (!verifyEmail(u.getEmail())) {
            if (!verifyUserName(u.getUsername())) {
                String SQL = "INSERT INTO users(`registeredOn`,`username`,`email`,`password`,`name`) VALUES('%s','%s','%s','%s','%s')".formatted(u.getRegisteredOn(), u.getUsername(), u.getEmail(), u.getPassword(), u.getName());
                Statement stmt = db.createStatement();
                int a = stmt.executeUpdate(SQL);
                if (a > 0) {
                    db.close();
                    return true;

                } else {
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Username  Already Exists", "Warning", 1);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Email Already Exists", "Warning", 1);
            return false;
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }

    }

    //method to verify that the email provided already exists in the database or not
    private boolean verifyEmail(String email) {
        String sql = "SELECT * FROM users where email='" + email + "'";

        try {
            Statement stmt = db.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                return true;
            }
                return false;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }

    }
    //method to verify that the username provided already exists in the database or not
    private boolean verifyUserName(String username) {
        String sql = "SELECT * FROM users where username='" + username + "'";

        try {
            Statement stmt = db.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            if (rs.next()) {
                return true;
            }
            return false;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

}
