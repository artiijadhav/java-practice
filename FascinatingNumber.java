import java.util.Scanner;

public class FascinatingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int n2 = num * 2;
        int n3 = num * 3;

        String result = "" + num + n2 + n3;

        boolean isFascinating = true;

        for (char ch = '1'; ch <= '9'; ch++) {
            int count = 0;

            for (int i = 0; i < result.length(); i++) {
                if (result.charAt(i) == ch) {
                    count++;
                }
            }

            if (count != 1) {
                isFascinating = false;
                break;
            }
        }

        if (isFascinating && result.length() == 9) {
            System.out.println(num + " is a Fascinating Number.");
        } else {
            System.out.println(num + " is not a Fascinating Number.");
        }

        sc.close();
    }
}