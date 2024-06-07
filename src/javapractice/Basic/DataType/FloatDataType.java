package javapractice.Basic.DataType;

import java.util.Scanner;

public class FloatDataType {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your 10th Class Percentage = ");
        float x = sc.nextFloat();
        System.out.println(x);

        sc.close();
    }
}
