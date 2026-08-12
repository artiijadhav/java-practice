import java.util.Scanner;

public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter the character to replace: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter the new character: ");
        char newChar = sc.next().charAt(0);

        String result = str.replace(oldChar, newChar);

        System.out.println("Updated String: " + result);

        sc.close();
    }
}
