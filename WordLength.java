import java.util.Scanner;

public class WordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");

        System.out.println("Length of each word:");

        for (String word : words) {
            System.out.println(word + " = " + word.length());
        }

        sc.close();
    }
}
