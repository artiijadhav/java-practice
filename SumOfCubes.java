import java.util.Scanner;

public class SumOfCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + (long) i * i * i;
        }

        System.out.println("Sum of cubes = " + sum);

        sc.close();
    }
}