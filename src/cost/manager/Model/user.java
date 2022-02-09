package cost.manager.Model;


/*
     * model class for user storage
 */
public class user {

    private String registeredOn;
    private String username;
    private String email;
    private String password;
    private String name;

    public user() {
    }

    public user(String registeredOn, String username, String email, String password, String name) {

        this.registeredOn = registeredOn;
        this.username = username;
        this.email = email;
        this.password = password;
        this.name = name;
    }


    public String getRegisteredOn() {
        return registeredOn;
    }

    public void setRegisteredOn(String registeredOn) {
        this.registeredOn = registeredOn;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("USERNAME : " + String.valueOf(username) + System.lineSeparator());
        sb.append("EMAIL    : " + String.valueOf(email) + System.lineSeparator());
        sb.append("NAME     : " + String.valueOf(name) + System.lineSeparator());
        sb.append("REG. DATE: " + String.valueOf(registeredOn) + System.lineSeparator());
        return sb.toString();
    }
}
