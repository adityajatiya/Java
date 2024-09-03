package javapractice.OPPs.Inheritance.SingleLevelInheritance;

public class Main {

    public static void main(String[] args) {
        ParentClass s1 = new ParentClass();
        System.out.println("Mobile 1");
        s1.mobilePrice();
        s1.mobileBattery();
        s1.mobileFrontCamera();
        s1.mobileOperatingSystem();
        s1.mobilePrice();
        s1.mobileRam();
        s1.mobileRearCamera();
        s1.mobileRom();
        System.out.println("");
        BaseClass s2 = new BaseClass();
        System.out.println("Mobile 2");

        s2.mobilePrice();
        s2.mobileBattery();
        s2.mobileFrontCamera();
        s2.mobileOperatingSystem();
        s2.mobilePrice();
        s2.mobileRam();
        s2.mobileRearCamera();
        s2.mobileRom();

    }

}
