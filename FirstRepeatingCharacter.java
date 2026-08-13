import java.util.Scanner;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        char result = '\0';

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);

            for (int j = i + 1; j < str.length(); j++) {
                if (current == str.charAt(j)) {
                    result = current;
                    break;
                }
            }

            if (result != '\0') {
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First repeating character: " + result);
        } else {
            System.out.println("No repeating character found.");
        }

        sc.close();
    }
}