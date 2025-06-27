package challenges;

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escreva um número positivo: ");
        int number = scanner.nextInt();

        String numberString = String.valueOf(number);
        String numberInverted = new StringBuilder(numberString).reverse().toString();

        if (numberString.equals(numberInverted)) {
            System.out.println("O número " + number + " é um palíndromo.");
        } else {
            System.out.println("O número " + number + " não é um palíndromo.");
        }

        scanner.close();
    }

}
