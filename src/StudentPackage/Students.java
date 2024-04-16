package StudentPackage;

public class Students {
    private int stdid;
    private String stname;
    private int stage;
    private String stcity;

    public  Students(int stdid, String stname, int stage, String stcity) {
        this.stdid = stdid;
        this.stname = stname;
        this.stage = stage;
        this.stcity = stcity;
    }

    public Students(String stname, int stage, String stcity) {
        this.stname = stname;
        this.stage = stage;
        this.stcity = stcity;
    }

    public Students() {
        // Default constructor
    }

    // Getters
    public int getStdid() {
        return stdid;
    }

    public String getStname() {
        return stname;
    }

    public int getStage() {
        return stage;
    }

    public String getStcity() {
        return stcity;
    }

    // Setters
    public void setStdid(int stdid) {
        this.stdid = stdid;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public void setStcity(String stcity) {
        this.stcity = stcity;
    }

    // Override toString() method to provide a meaningful string representation of the object
    @Override
    public String toString() {
        return "Student ID: " + stdid + ", Name: " + stname + ", Age: " + stage + ", City: " + stcity;
    }
}
