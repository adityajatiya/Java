package javapractice.Basic.StaticMethod;

public class Student {

    int rollNo = 10;
    String name;
    static String college;

    Student(int r, String n) {
        this.rollNo = r;
        this.name = n;
    }

    public void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}