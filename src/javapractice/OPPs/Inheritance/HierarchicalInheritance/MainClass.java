package javapractice.OPPs.Inheritance.HierarchicalInheritance;

public class MainClass {

    public static void main(String[] args) {
        System.out.println("Cat");
        Cat s1 = new Cat();
        s1.eat();
        s1.meow();
        System.out.println("Dog");

        Dog s2 = new Dog();
        s2.bark();
        s2.eat();

    }
}
