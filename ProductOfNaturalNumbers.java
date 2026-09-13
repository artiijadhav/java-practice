import java.util.Scanner;

public class ProductOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        long product = 1;

        for (int i = 1; i <= n; i++) {
            product = product * i;
        }

        System.out.println("Product of natural numbers = " + product);

        sc.close();
    }
}