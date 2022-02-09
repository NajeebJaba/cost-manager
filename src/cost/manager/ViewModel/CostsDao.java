package cost.manager.ViewModel;

import cost.manager.Model.cost;
import cost.manager.Model.costRetrival;
import cost.manager.utils;
import java.sql.*;
import java.util.ArrayList;

public class CostsDao {
    //variable to store the database connection

    private Connection db;
    //variable tp store the database handler
    private dbHandler dbh;

    //constructor method for the CostsDao Class
    public CostsDao() {
        try {
            dbh = new dbHandler();
            db = dbh.getConnection();
        } catch (Exception e) {
        }
    }
//method for adding the new cost with the data c
    public boolean newCost(cost c) {
        try {

            String SQL = "INSERT INTO costs(`user_id`,`date`,`time`,`currency`,`description`,`sum`,`Category`) VALUES('%d','%s','%s','%s','%s','%d','%s')".formatted(c.getUser_id(), c.getDate(), c.getTime(), c.getCurrency(), c.getDescription(), (int) c.getSum(), c.getCat_id());
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

    //method for filterting the costs data between two provided dates fromDate and toDate
    public ArrayList<costRetrival> getFilter(String fromDate, String toDate) {
        ArrayList<costRetrival> co = new ArrayList<>();
        try {
            int userId = Integer.valueOf(utils.getData("session.txt"));
            String SQL = "SELECT * FROM costs where costs.date BETWEEN '%s' and '%s' and  user_id = %d".formatted(fromDate, toDate, userId);
            System.out.println("[SQL] :%s".formatted(SQL));
            Statement stmt = db.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            while (rs.next()) {
                costRetrival c = new costRetrival();
                c.setCat_id(rs.getString("Category"));
                c.setRecord_Id(rs.getInt("record_id"));
                c.setUser_id(rs.getInt("user_id"));
                c.setCurrency(rs.getString("currency"));
                c.setSum(rs.getInt("sum"));
                c.setDescription(rs.getString("description"));
                c.setDate(rs.getString("date"));
                c.setTime(rs.getString("time"));
                co.add(c);

            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return co;
    }
//method for deleting the costs data of the selected id from the database 
    public void delete(int id) {
        try {
            String SQL = "DELETE  FROM costs where  record_id = %d".formatted(id);
            Statement stmt = db.createStatement();
            stmt.executeUpdate(SQL);


        } catch (Exception e) {

        }

    }

    //method for getting the data between present in the database
    public ArrayList<costRetrival> getCosts() {
        ArrayList<costRetrival> co = new ArrayList<>();
        try {
            int userId = Integer.valueOf(utils.getData("session.txt"));
            String SQL = "SELECT * FROM costs where  user_id = %d".formatted(userId);
            Statement stmt = db.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            while (rs.next()) {

                costRetrival c = new costRetrival();
                c.setCat_id(rs.getString("Category"));
                c.setRecord_Id(rs.getInt("record_id"));
                c.setUser_id(rs.getInt("user_id"));
                c.setCurrency(rs.getString("currency"));
                c.setSum(rs.getInt("sum"));
                c.setDescription(rs.getString("description"));
                c.setDate(rs.getString("date"));
                c.setTime(rs.getString("time"));

                co.add(c);


            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return co;
    }
}
