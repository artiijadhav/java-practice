import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");
        String hex = sc.nextLine();

        int decimal = 0;
        int power = 1;

        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = hex.charAt(i);
            int digit;

            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else if (ch >= 'A' && ch <= 'F') {
                digit = ch - 'A' + 10;
            } else if (ch >= 'a' && ch <= 'f') {
                digit = ch - 'a' + 10;
            } else {
                System.out.println("Invalid hexadecimal number.");
                sc.close();
                return;
            }

            decimal = decimal + digit * power;
            power = power * 16;
        }

        System.out.println("Decimal = " + decimal);

        sc.close();
    }
}