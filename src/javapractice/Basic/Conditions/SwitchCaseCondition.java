package javapractice.Basic.Conditions;

import java.util.Scanner;

public class SwitchCaseCondition {

    public static void main(String[] args) {
        System.out.print("Calculator\n");
        System.out.println("Press 1 For Addition");
        System.out.println("Press 2 For Subtraction");
        System.out.println("Press 3 For Mutiplication");
        System.out.println("Press 4 For division");

        System.out.print("Press A Number = ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.print("Enter Two Number = ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Addition = " + (n1 + n2));
                break;
            case 2:
                System.out.println("Subtraction = " + (n1 - n2));
                break;
            case 3:
                System.out.println("Multiplication = " + (n1 * n2));
                break;
            case 4:
                System.out.println("division = " + (n1 / n2));
                break;

            default:
                System.out.println("Invalid Number");
        }

    }
}
