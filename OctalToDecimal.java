import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an octal number: ");
        int octal = sc.nextInt();

        int decimal = 0;
        int power = 1;
        int temp = octal;

        while (temp != 0) {
            int digit = temp % 10;
            decimal = decimal + digit * power;
            power = power * 8;
            temp = temp / 10;
        }

        System.out.println("Decimal = " + decimal);

        sc.close();
    }
}
