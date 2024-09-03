package javapractice.OPPs.Interface;

public class MainClass {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();
        cat.size();

        Dog dog = new Dog();
        dog.voice();
        dog.size();
    }
}
