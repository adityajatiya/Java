package javapractice.OPPs.Abstraction;

public class Mainclass {

    public static void main(String[] args) {
        Mercedes m = new Mercedes();
        Audi a = new Audi();
        Lamborghini l = new Lamborghini();
        m.Speed();
        m.fuel();
        a.Speed();
        a.fuel();
        l.Speed();
        l.fuel();
    }
}
