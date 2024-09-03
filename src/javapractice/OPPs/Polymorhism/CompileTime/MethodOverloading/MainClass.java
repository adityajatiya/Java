package javapractice.OPPs.Polymorhism.CompileTime.MethodOverloading;

public class MainClass {

    public static void main(String args[]) {
        Student student = new Student();
        student.name = "Aditya";
        student.age = 19;
        student.printInfo(student.name);
        student.printInfo(student.age);
        student.printInfo(student.name, student.age);
    }
}
