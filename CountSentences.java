import java.util.Scanner;

public class CountSentences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a paragraph: ");
        String text = sc.nextLine().trim();

        if (text.isEmpty()) {
            System.out.println("Number of sentences = 0");
        } else {
            String[] sentences = text.split("[.!?]+");

            int count = 0;

            for (String sentence : sentences) {
                if (!sentence.trim().isEmpty()) {
                    count++;
                }
            }

            System.out.println("Number of sentences = " + count);
        }

        sc.close();
    }
}
