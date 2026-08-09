import java.util.Scanner;

public class ConvertToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String lowerCase = str.toLowerCase();

        System.out.println("Lowercase String: " + lowerCase);

        sc.close();
    }
}