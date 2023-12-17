
import java.util.Scanner;

public class MyFunction {

    public static int XOR(int a, int b, int c) {
        return a ^ b ^ c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A = ");
        int a = scanner.nextInt();

        System.out.print("B = ");
        int b = scanner.nextInt();

        System.out.print("C = ");
        int c = scanner.nextInt();

        int result = XOR(a, b, c);
        System.out.println("A ^ B ^ C = " + result);

        scanner.close();
    }
}

