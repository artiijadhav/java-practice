import java.util.Scanner;

public class FindDuplicateWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.toLowerCase().trim().split("\\s+");

        System.out.println("Duplicate words:");

        boolean found = false;

        for (int i = 0; i < words.length; i++) {
            boolean alreadyChecked = false;

            for (int k = 0; k < i; k++) {
                if (words[i].equals(words[k])) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(words[i] + " = " + count + " times");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No duplicate words found.");
        }

        sc.close();
    }
}
