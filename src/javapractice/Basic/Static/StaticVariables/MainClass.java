package javapractice.Basic.Static.StaticVariables;

public class MainClass {

    public static void main(String[] args) {
        Student student = new Student(1, "Aditya");
        Student student2 = new Student(2, "Shivam");
        student.college = "MBM";
        student.display();
        student2.display();
    }
}