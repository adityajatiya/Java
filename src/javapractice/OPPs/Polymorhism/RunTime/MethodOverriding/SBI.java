package javapractice.OPPs.Polymorhism.RunTime.MethodOverriding;

class SBI extends Bank {

    @Override
    public void savingAccountAmount() {
        System.out.println("In SBI Bank open the saving account in bank is minimum deposit is zero balance");
    }
}
