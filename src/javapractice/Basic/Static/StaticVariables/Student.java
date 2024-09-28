package javapractice.Basic.Static.StaticVariables;

public class Student {

    int rollNo = 10;
    String name;
    static String college;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}