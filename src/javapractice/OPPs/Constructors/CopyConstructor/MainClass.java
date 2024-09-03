package javapractice.OPPs.Constructors.CopyConstructor;

public class MainClass {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "aditya";
        student.age = 19;
        Student student2 = new Student(student);
        student2.printInfo();
    }
}
