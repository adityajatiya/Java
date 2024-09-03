package javapractice.OPPs.Constructors.ParameterizedConstructor;

public class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}
