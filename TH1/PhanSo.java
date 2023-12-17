
import java.util.Scanner;


public class PhanSo {
    private int tuSo;
    private int mauSo;
    public PhanSo(){
        this.tuSo = 0;
        this.mauSo = 1;
    }
    public PhanSo(int n){
        this.tuSo = n;
        this.mauSo = 1;
    }
    public PhanSo(int x,int y){
        int ucln = UCLN(Math.abs(x),Math.abs(y));
        this.tuSo = x / ucln;
        this.mauSo = y / ucln;
    }
    public int UCLN(int a,int b){
           while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public String toString() {
        return tuSo + "/" + mauSo;
    }
    public double toDouble() {
        return (double) tuSo / mauSo;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tu so = ");
        int a = scanner.nextInt();

        System.out.print("Mau so = ");
        int b = scanner.nextInt();

        PhanSo phanSo = new PhanSo(a, b);

        System.out.println("Phan So: " + phanSo.toString());
        System.out.println("Gia tri phan so: " + phanSo.toDouble());

        scanner.close();
    }

}
