package challenges;

import java.util.Scanner;

public class AddNumbersUntilZeroIsEntered {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = -1;
        int sum = 0;

        while (num != 0) {
            System.out.println("Digit a number (0 to exit): ");
            num = scanner.nextInt();
            sum = sum + num;
        }

        System.out.println("Total sum: " + sum);
        scanner.close();
    }
}
