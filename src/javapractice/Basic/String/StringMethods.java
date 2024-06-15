package javapractice.Basic.DataType.String;

public class StringMethods {

    public static void main(String[] args) {
        String a = "ADITYA";
        String b = "abhishek";

        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        System.out.println(b.concat(a));
        System.out.println(a.length());
        String c = "        aditya         ";
        String d = "";

        System.out.println(c.trim());
        System.out.println(d.isEmpty());

        System.out.println(b.charAt(4));
        System.out.println(a.indexOf('D'));

        System.out.println(a.equals(b));
        System.out.println(a.replace('T', 'C'));
        System.out.println(a.replaceAll(a, b));

    }
}
