package javapractice.OPPs.Polymorhism.CompileTime.MethodOverloading;

public class MainClass {

    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.age = 19;
        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name, s1.age);
    }

}
