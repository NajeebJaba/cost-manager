package cost.manager;

import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class utils {
    /*
        *getting the current Date in formate dd-MM-yy
     */
    public static String getCurrentDate() {
        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("dd-MM-yyyy");
        String stringDate = DateFor.format(date);
        return stringDate;
    }

    /*
        *getting the current Time in formate HH-mm-ss
     */
    public static String getCurrentTime() {
        Date date = new Date();
        SimpleDateFormat DateFor = new SimpleDateFormat("HH:mm:ss");
        String stringDate = DateFor.format(date);
        return stringDate;
    }

    /*
     * method to write the data to a file 
    
     */
    public static void writeDate(String filename, String value) {
        try {
            File f = new File(filename);
            FileWriter fw = new FileWriter(f);
            fw.write(value);
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    /*
     * method to get the data from a file 
    
     */
    public static String getData(String filename) {
        try {
            File f = new File(filename);
            Scanner myReader = new Scanner(f);
            String data = "";
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
            }

            myReader.close();
            return data;
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return null;
    }
}
