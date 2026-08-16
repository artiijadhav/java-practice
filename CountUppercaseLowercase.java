import java.util.Scanner;

public class CountUppercaseLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int uppercase = 0;
        int lowercase = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                uppercase++;
            } else if (Character.isLowerCase(ch)) {
                lowercase++;
            }
        }

        System.out.println("Uppercase characters = " + uppercase);
        System.out.println("Lowercase characters = " + lowercase);

        sc.close();
    }
}
