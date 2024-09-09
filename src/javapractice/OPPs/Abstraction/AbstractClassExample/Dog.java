package javapractice.OPPs.Abstraction.AbstractClassExample;

abstract class Dog extends Animal {

    abstract void run();

    @Override
    void sound() {
        System.out.println("Barking");
    }
}
