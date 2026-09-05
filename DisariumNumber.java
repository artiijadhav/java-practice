import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int digits = 0;

        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = num;
        int sum = 0;
        int position = digits;

        while (temp != 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 1; i <= position; i++) {
                power = power * digit;
            }

            sum = sum + power;
            temp = temp / 10;
            position--;
        }

        if (sum == original) {
            System.out.println(original + " is a Disarium Number.");
        } else {
            System.out.println(original + " is not a Disarium Number.");
        }

        sc.close();
    }
}
