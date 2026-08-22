import java.util.Scanner;

public class CountWordsStartingWithVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");
        int count = 0;

        for (String word : words) {
            char first = Character.toLowerCase(word.charAt(0));

            if (first == 'a' || first == 'e' || first == 'i' ||
                first == 'o' || first == 'u') {
                count++;
            }
        }

        System.out.println("Words starting with a vowel = " + count);

        sc.close();
    }
}