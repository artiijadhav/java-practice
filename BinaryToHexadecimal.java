import java.util.Scanner;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = sc.nextLine();

        int decimal = 0;

        for (int i = 0; i < binary.length(); i++) {
            char ch = binary.charAt(i);

            if (ch != '0' && ch != '1') {
                System.out.println("Invalid binary number.");
                sc.close();
                return;
            }

            decimal = decimal * 2 + (ch - '0');
        }

        String hexadecimal = "";

        if (decimal == 0) {
            hexadecimal = "0";
        }

        while (decimal > 0) {
            int remainder = decimal % 16;

            if (remainder < 10) {
                hexadecimal = remainder + hexadecimal;
            } else {
                hexadecimal = (char)('A' + remainder - 10) + hexadecimal;
            }

            decimal = decimal / 16;
        }

        System.out.println("Hexadecimal = " + hexadecimal);

        sc.close();
    }
}
