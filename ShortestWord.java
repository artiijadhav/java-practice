import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");

        String shortestWord = words[0];

        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        System.out.println("Shortest word = " + shortestWord);
        System.out.println("Length = " + shortestWord.length());

        sc.close();
    }
}
