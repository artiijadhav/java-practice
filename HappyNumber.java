import java.util.Scanner;

public class HappyNumber {

    public static int sumOfSquares(int num) {
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit * digit;
            num = num / 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;

        while (num != 1 && num != 4) {
            num = sumOfSquares(num);
        }

        if (num == 1) {
            System.out.println(original + " is a Happy Number.");
        } else {
            System.out.println(original + " is not a Happy Number.");
        }

        sc.close();
    }
}