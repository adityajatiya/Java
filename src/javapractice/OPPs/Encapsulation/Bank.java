package javapractice.OPPs.Encapsulation;

public class Bank {
    //Public = All classes access

    public String name;
    protected String email;
    private String password;

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
