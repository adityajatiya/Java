package javapractice.OPPs.Polymorhism.RunTime.MethodOverriding;

public class MainClass {

    public static void main(String[] args) {
        SBI s = new SBI();
        HDFC i = new HDFC();
        AXIS a = new AXIS();
        System.out.println("Open the saving account in all bank is minimum deposit Balance");
        s.savingAccountAmount();
        i.savingAccountAmount();
        a.savingAccountAmount();
    }

}
