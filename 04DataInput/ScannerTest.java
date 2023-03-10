import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1:");
        int num1 = sc.nextInt();

        System.out.println("Enter number 2:");
        int num2 = sc.nextInt();

        System.out.println("num1 + num2 = ");
        System.out.println(num1 + num2);
    }
}
