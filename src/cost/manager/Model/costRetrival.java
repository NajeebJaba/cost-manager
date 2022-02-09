package cost.manager.Model;


/*
     * model class for costRetrival
 */
public class costRetrival {

    private int recordId;
    private int user_id;
    private String date;
    private String time;
    private String currency;
    private String description;
    private double sum;
    private String cat_id;

    public costRetrival() {
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

    public void setRecord_Id(int RecordId) {
        this.recordId = RecordId;
    }

    public int getRecordID() {
        return this.recordId;
    }

    public String toString() {
        return this.recordId + "";
    }
}
