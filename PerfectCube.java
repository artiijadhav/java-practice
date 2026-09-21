import java.util.Scanner;

public class PerfectCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPerfectCube = false;

        for (int i = 1; i * i * i <= num; i++) {
            if (i * i * i == num) {
                isPerfectCube = true;
                break;
            }
        }

        if (isPerfectCube) {
            System.out.println(num + " is a Perfect Cube.");
        } else {
            System.out.println(num + " is not a Perfect Cube.");
        }

        sc.close();
    }
}