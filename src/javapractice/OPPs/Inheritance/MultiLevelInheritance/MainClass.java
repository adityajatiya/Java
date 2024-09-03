package javapractice.OPPs.Inheritance.MultiLevelInheritance;

public class MainClass {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.camera();
        m.rom();
        m.ram();
        m.battery();
        m.price();

        IPhone10 m1 = new IPhone10();
        m1.camera();
        m1.rom();
        m1.ram();
        m1.battery();
        m1.price();

        IPhone11 m2 = new IPhone11();
        m2.camera();
        m.rom();
        m2.ram();
        m2.battery();
        m2.price();
        IPhone12 m3 = new IPhone12();
        m3.camera();
        m3.rom();
        m3.ram();
        m3.battery();
        m3.price();
    }
}
