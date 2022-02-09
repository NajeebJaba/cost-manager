package cost.manager.Model;


/*
     * model class for cost storage
 */
public class cost {
    private int user_id;
    private String date;
    private String time;
    private String currency;
    private String description;
    private double sum;
    private String cat_id;

    public cost() {
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getCat_id() {
        return cat_id;
    }

    public void setCat_id(String cat_id) {
        this.cat_id = cat_id;
    }

    public cost(int user_id, String date, String time, String currency, String description, double sum, String cat_id) {

        this.user_id = user_id;
        this.date = date;
        this.time = time;
        this.currency = currency;
        this.description = description;
        this.sum = sum;
        this.cat_id = cat_id;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("USER     : " + String.valueOf(user_id) + System.lineSeparator());
        sb.append("DATE     : " + String.valueOf(date) + System.lineSeparator());
        sb.append("TIME     : " + String.valueOf(time) + System.lineSeparator());
        sb.append("COST     : " + String.valueOf(sum) + System.lineSeparator());
        sb.append("DESP.    : " + String.valueOf(description) + System.lineSeparator());
        sb.append("CAT.     : " + String.valueOf(cat_id) + System.lineSeparator());
        return sb.toString();
    }

}
