package javapractice.OPPs.Constructors.CopyConstructor;

public class MainClass {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "aditya";
        s1.age = 19;
        Student student = new Student(s1);
        student.printInfo();
    }
}
