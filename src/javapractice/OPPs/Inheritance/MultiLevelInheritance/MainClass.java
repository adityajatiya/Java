package javapractice.OPPs.Inheritance.MultiLevelInheritance;

public class MainClass {

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        mobile.camera();
        mobile.rom();
        mobile.ram();
        mobile.battery();
        mobile.price();

        IPhone10 iPhone10 = new IPhone10();
        iPhone10.camera();
        iPhone10.rom();
        iPhone10.ram();
        iPhone10.battery();
        iPhone10.price();

        IPhone11 iPhone11 = new IPhone11();
        iPhone11.camera();
        iPhone11.rom();
        iPhone11.ram();
        iPhone11.battery();
        iPhone11.price();
        
        IPhone12 iPhone12 = new IPhone12();
        iPhone12.camera();
        iPhone12.rom();
        iPhone12.ram();
        iPhone12.battery();
        iPhone12.price();
    }
}
