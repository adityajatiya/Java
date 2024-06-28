package javapractice.Basic.Operator;

public class TernaryOperator {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int max;
        max = (a > b) ? a : b;
        System.out.println(max);
        max = (a < b) ? a : b;
        System.out.println(max);
        max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max);

    }

}
