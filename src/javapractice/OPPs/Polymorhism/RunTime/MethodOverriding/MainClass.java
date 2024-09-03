package javapractice.OPPs.Polymorhism.RunTime.MethodOverriding;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Open the saving account in all bank is minimum deposit Balance");
        SBI sbi = new SBI();
        sbi.savingAccountAmount();

        HDFC hdfc = new HDFC();
        hdfc.savingAccountAmount();

        AXIS axis = new AXIS();
        axis.savingAccountAmount();
    }
}
