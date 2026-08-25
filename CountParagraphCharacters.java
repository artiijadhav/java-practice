import java.util.Scanner;

public class CountParagraphCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a paragraph: ");
        String text = sc.nextLine();

        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println("Number of characters = " + count);

        sc.close();
    }
}