package javapractice.OPPs.Inheritance.HierarchicalInheritance;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Cat");
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        System.out.println("Dog");
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }
}
