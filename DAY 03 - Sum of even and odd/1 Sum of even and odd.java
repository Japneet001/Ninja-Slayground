/*  Write a program to input an integer 'n' and print the sum of all its even digits and sum of all its odd digits separately.
    Digits mean numbers, not the places! That is, if the given integer is "132456", even digits are 2, 4 and 6 and odd digits are 1, 3 and 5.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum_even = 0;
        int sum_odd = 0;
        while (n > 0) {
            int rem = n % 10;
            if (rem % 2 == 0) {
                sum_even += rem;
            } else {
                sum_odd += rem;
            }
            n = n / 10;
        }
        System.out.println(sum_even + " " + sum_odd);
        // Write your code here

    }
}
