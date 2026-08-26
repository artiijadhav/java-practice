import java.util.Scanner;

public class CountParagraphWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a paragraph: ");
        String text = sc.nextLine().trim();

        if (text.isEmpty()) {
            System.out.println("Number of words = 0");
        } else {
            String[] words = text.split("\\s+");

            System.out.println("Number of words = " + words.length);
        }

        sc.close();
    }
}
