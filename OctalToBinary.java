import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        int octal = sc.nextInt();

        int decimal = 0;
        int power = 1;
        int temp = octal;

        while (temp != 0) {
            int digit = temp % 10;

            if (digit > 7) {
                System.out.println("Invalid octal number.");
                sc.close();
                return;
            }

            decimal = decimal + digit * power;
            power = power * 8;
            temp = temp / 10;
        }

        String binary = "";

        if (decimal == 0) {
            binary = "0";
        }

        while (decimal > 0) {
            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }

        System.out.println("Binary = " + binary);

        sc.close();
    }
}
