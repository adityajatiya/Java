package javapractice.Basic.DataType;

import java.util.Scanner;

public class IntegerDataType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age = ");
        int x = sc.nextInt();
        System.out.println(x);

        sc.close();
    }
}
