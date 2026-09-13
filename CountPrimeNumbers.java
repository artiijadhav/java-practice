import java.util.Scanner;

public class CountPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        int count = 0;

        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        System.out.println("Number of prime numbers = " + count);

        sc.close();
    }
}