import java.util.Scanner;

public class SumFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);

        int lastDigit = temp % 10;

        while (temp >= 10) {
            temp = temp / 10;
        }

        int firstDigit = temp;
        int sum = firstDigit + lastDigit;

        System.out.println("First digit = " + firstDigit);
        System.out.println("Last digit = " + lastDigit);
        System.out.println("Sum = " + sum);

        sc.close();
    }
}