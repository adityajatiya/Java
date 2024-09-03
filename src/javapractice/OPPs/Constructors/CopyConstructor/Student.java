package javapractice.OPPs.Constructors.CopyConstructor;

public class Student {

    String name;
    int age;

    Student() {
    }

    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
    }

    public void printInfo() {
        System.out.println(name);
        System.out.println(age);
    }
}
