import java.util.concurrent.locks.LockSupport;
import java.util.Scanner;




public class MyDelay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("N = ");
        int N = scanner.nextInt();

        System.out.println("Chuong trinh ket thuc sau " + N + " giay ...");

        for (int i = 1; i <= N; i++) {
            System.out.print(i + " ");
            
            LockSupport.parkNanos(1_000_000_000);
        }

        scanner.close();
    }
}



