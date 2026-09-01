import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int nextNumber = num + 1;
        int root = (int) Math.sqrt(nextNumber);

        if (root * root == nextNumber) {
            System.out.println(num + " is a Sunny Number.");
        } else {
            System.out.println(num + " is not a Sunny Number.");
        }

        sc.close();
    }
}