import java.util.Scanner;

public class WordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the word to search: ");
        String target = sc.next();

        String[] words = sentence.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.equalsIgnoreCase(target)) {
                count++;
            }
        }

        System.out.println("Frequency of \"" + target + "\" = " + count);

        sc.close();
    }
}
