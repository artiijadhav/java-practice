import java.util.Scanner;

public class CoppyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] original = new int[n];
        int[] copy = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            original[i] = sc.nextInt();
        }

        // Copy elements
        for (int i = 0; i < n; i++) {
            copy[i] = original[i];
        }

        System.out.println("Copied array elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(copy[i] + " ");
        }

        sc.close();
    }
}
