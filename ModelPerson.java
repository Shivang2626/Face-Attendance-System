package Util;

public class ModelPerson {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    private String first_name, last_name, dob, office,pass;

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ModelPerson() {
    }

    public ModelPerson( String first_name, String last_name, String dob, String office,int id) {
       
        this.first_name = first_name;
        this.last_name = last_name;
        this.dob = dob;
        this.office = office;
        this.id=id;
    }

   

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

   
}
