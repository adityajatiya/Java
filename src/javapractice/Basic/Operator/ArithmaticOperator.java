package javapractice.Basic.Operator;

import java.util.Scanner;

public class ArithmaticOperator {

    public static void main(String[] args) {
        int a, b;
        System.out.print("Enter Two Number = ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Addition =  " + (a + b));
        System.out.println("Subtaraction  = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Remainder  = " + (a % b));
    }

}
