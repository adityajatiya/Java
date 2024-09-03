package javapractice.OPPs.Encapsulation;

public class Bank {
    //Public = All classes access

    public String name;
    protected String email;
    private String Password;

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String pass) {
        this.Password = pass;
    }
}
