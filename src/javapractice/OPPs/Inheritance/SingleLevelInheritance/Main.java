package javapractice.OPPs.Inheritance.SingleLevelInheritance;

public class Main {

    public static void main(String[] args) {
        ParentClass parentClass = new ParentClass();
        System.out.println("Mobile 1");
        parentClass.mobilePrice();
        parentClass.mobileBattery();
        parentClass.mobileFrontCamera();
        parentClass.mobileOperatingSystem();
        parentClass.mobilePrice();
        parentClass.mobileRam();
        parentClass.mobileRearCamera();
        parentClass.mobileRom();

        System.out.println("\nMobile 2");
        BaseClass baseClass = new BaseClass();
        baseClass.mobilePrice();
        baseClass.mobileBattery();
        baseClass.mobileFrontCamera();
        baseClass.mobileOperatingSystem();
        baseClass.mobilePrice();
        baseClass.mobileRam();
        baseClass.mobileRearCamera();
        baseClass.mobileRom();

    }

}
