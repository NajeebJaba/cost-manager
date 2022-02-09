package cost.manager.Model;
/*
     * model class for category storage
 */
public class category {
    private String name;

    /*
     * method for constructor
    
     */
    public category() {
    }

    public category(String name) {

        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return this.getName();

    }
}
