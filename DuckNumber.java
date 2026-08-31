import java.util.Scanner;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.nextLine();

        boolean isDuck = false;

        if (num.charAt(0) != '0' && num.contains("0")) {
            isDuck = true;
        }

        if (isDuck) {
            System.out.println(num + " is a Duck Number.");
        } else {
            System.out.println(num + " is not a Duck Number.");
        }

        sc.close();
    }
}
