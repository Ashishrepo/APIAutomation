package Practise_Problems;

public class Reverse_Number {

    public static void main(String[] args) {


        // Decimal number has base of 10
        int n = 120;

        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;  //remainder
            n = n / 10; // quotient
        }

        System.out.println(rev);
    }
}
