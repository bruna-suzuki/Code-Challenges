package challenges;

public class MaximumNumber {
    public static void main(String[] args) {
        int[] num = {3, 8, 5, 2, 10, 4};
        int maxNum = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > maxNum) {
                maxNum = num[i];
            }
        }
        System.out.println("O maior número é: " + maxNum);
    }
}
