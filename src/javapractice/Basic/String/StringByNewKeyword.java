package javapractice.Basic.DataType.String;

import java.util.Scanner;

public class StringByNewKeyword {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name Enter = ");
        String name = new String();
        name = sc.nextLine();

        System.out.print("Name = " + name + "\n");

        name = "ram";
        System.out.print("Name = " + name + "\n");
    }
}
