package challenges;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String word = "programacao";
        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if ("aeiou".indexOf(letter) != -1) {
                vowel = vowel + 1;
            } else {
                consonant = consonant + 1;
            }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);
    }
}
