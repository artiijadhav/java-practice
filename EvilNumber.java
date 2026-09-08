import java.util.Scanner;

public class EvilNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (temp > 0) {
            int digit = temp % 2;

            if (digit == 1) {
                count++;
            }

            temp = temp / 2;
        }

        if (count % 2 == 0) {
            System.out.println(num + " is an Evil Number.");
        } else {
            System.out.println(num + " is not an Evil Number.");
        }

        sc.close();
    }
}