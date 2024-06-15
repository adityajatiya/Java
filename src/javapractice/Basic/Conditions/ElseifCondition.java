package javapractice.Basic.Conditions;

import java.util.Scanner;

public class ElseifCondition {

    public static void main(String[] args) {
        System.out.print("Enter Two Number = ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("A is Greater");
        } else {
            System.out.println("B is Greater");
        }
    }
}
