package javapractice.Basic.StaticMethod;

public class StaticMethod {

    int a = 10;
    static int b = 20;

    static void show() {
        System.out.println(b);
    }

    void print() {
        System.out.println(a + " " + b);
    }
}
