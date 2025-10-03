package challenges;

public class Palindrome {
    public static void main(String[] args) {
        String word = "arara";
        boolean palindromeWord = true;

        for (int i = 0; i < word.length() / 2; i++) {
            int lastWord = word.length() - 1 -i;
            if (word.charAt(i) != word.charAt(lastWord)) {
                palindromeWord = false;
            }
        }
        System.out.println("Is it palindrome? " + palindromeWord);
    }
}
