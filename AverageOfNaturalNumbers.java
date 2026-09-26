import java.util.Scanner;

public class AverageOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the limit: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        double average = (double) sum / n;

        System.out.println("Average = " + average);

        sc.close();
    }
}