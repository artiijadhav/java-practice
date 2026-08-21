import java.util.Scanner;

public class CountAlphanumeric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                count++;
            }
        }

        System.out.println("Number of alphanumeric characters = " + count);

        sc.close();
    }
}