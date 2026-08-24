import java.util.Scanner;

public class RemoveDuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.trim().split("\\s+");

        System.out.println("Sentence after removing duplicate words:");

        for (int i = 0; i < words.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(words[i] + " ");
            }
        }

        sc.close();
    }
}
