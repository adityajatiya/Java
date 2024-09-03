package javapractice.OPPs.Encapsulation;

public class MainClass {

    public static void main(String[] args) {
        Bank b = new Bank();
        b.name = "aditya";
        b.email = "adiya123@gmail.com";
        b.setPassword("13456");
        System.out.println(b.getPassword());
    }
}
