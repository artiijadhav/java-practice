import java.util.Scanner;

public class CountParagraphLines {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a paragraph.");
        System.out.println("Type END on a new line to finish:");

        int count = 0;

        while (true) {
            String line = sc.nextLine();

            if (line.equalsIgnoreCase("END")) {
                break;
            }

            count++;
        }

        System.out.println("Number of lines = " + count);

        sc.close();
    }
}
