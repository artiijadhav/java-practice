import java.util.Scanner;
public class Multiplication{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        int mul=a*b;
        System.out.println("Multiplication =" +mul);
        sc.close();
    }
}