package challenges;

import java.util.Scanner;

public class AddEvenNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of pairs from 1 to: " + N + " = " + sum);
        sc.close();
    }
}
