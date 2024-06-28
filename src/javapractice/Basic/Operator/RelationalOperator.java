package javapractice.Basic.Operator;

import java.util.Scanner;

public class RelationalOperator {

    public static void main(String[] args) {
        int a, b;
        System.out.print("Enter Two Number = ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("True/False =  " + (a < b));
        System.out.println("True/False =  " + (a > b));
        System.out.println("True/False =  " + (a <= b));
        System.out.println("True/False =  " + (a >= b));
        System.out.println("True/False =  " + (a == b));
        System.out.println("True/False =  " + (a != b));

    }
}
