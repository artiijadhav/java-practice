import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int max = (num1 > num2) ? num1 : num2;

        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                System.out.println("LCM = " + max);
                break;
            }
            max++;
        }

        sc.close();
    }
}
