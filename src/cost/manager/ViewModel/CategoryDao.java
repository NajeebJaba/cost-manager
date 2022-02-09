package cost.manager.ViewModel;

import cost.manager.Model.category;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CategoryDao {

    //variable to store the database connection
    private Connection db;
    //variable tp store the database handler
    private dbHandler dbh;

    //constructor for Category Dao
    public CategoryDao() {
        try {
            dbh = new dbHandler();
            db = dbh.getConnection();
        } catch (Exception e) {
        }
    }
//method for verifying that category with the title already exixts or not
    private boolean verifyCategory(String name) {
        String sql = "SELECT * FROM categories where title='" + name + "'";

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
//method for adding the new catgeory to the database 
    public boolean newCategory(category c) {
        try {
            if (!verifyCategory(c.getName())) {
                String SQL = "INSERT INTO categories(`title`) VALUES('%s')".formatted(c.getName());

                Statement stmt = db.createStatement();
                int a = stmt.executeUpdate(SQL);
                if (a > 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Category Already Exists", "Error", 1);
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }
        return false;
    }

    //method for deleting the seleted catgeory from the database 
    public boolean deleteCategory(category c) {
        try {
                String SQL = "DELETE FROM categories WHERE title = '%s'".formatted(c.getName());

                Statement stmt = db.createStatement();
                int a = stmt.executeUpdate(SQL);
                if (a > 0) {
                    return true;
                } else {
                    return false;
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }

    }
//method for getting all the categories present in the database 
    public ArrayList<String> getCategories() {
        ArrayList<String> a = new ArrayList<String>();
        try {

            String SQL = "SELECT title FROM categories";
            Statement stmt = db.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                a.add(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }

        return a;
    }
}
