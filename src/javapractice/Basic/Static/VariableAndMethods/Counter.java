package javapractice.Basic.Static.VariableAndMethods;

public class Counter {

    static int counter = 0;

    public static void increment() {
        counter++;
        System.out.println("Counter Value = " + counter);
    }
}