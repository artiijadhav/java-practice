import java.util.Scanner;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);
        int count = 0;

        if (temp == 0) {
            count = 1;
        } else {
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
        }

        System.out.println("Number of digits = " + count);

        sc.close();
    }
}
