package javapractice.OPPs.Encapsulation;

public class MainClass {

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.name = "aditya";
        bank.email = "adiya123@gmail.com";
        bank.setPassword("13456");
        System.out.println(bank.getPassword());
    }
}
