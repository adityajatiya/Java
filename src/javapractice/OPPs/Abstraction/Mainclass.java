package javapractice.OPPs.Abstraction;

public class Mainclass {

    public static void main(String[] args) {
        Mercedes mercedes = new Mercedes();

        mercedes.Speed();
        mercedes.fuel();

        Audi audi = new Audi();
        audi.Speed();
        audi.fuel();

        Lamborghini lamborghini = new Lamborghini();
        lamborghini.Speed();
        lamborghini.fuel();
    }
}
