package pkg;
import java.util.Scanner;

public class App2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Chọn hình cần tính chu vi và diện tích:");
            System.out.println("1. Hình tròn");
            System.out.println("2. Hình vuông");
            System.out.println("3. Hình chữ nhật");
            System.out.println("0. Thoát");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Nhập bán kính hình tròn: ");
                    double banKinh = scanner.nextDouble();
                    HinhTron hinhTron = new HinhTron(banKinh);
                    System.out.println("Chu vi hình tròn: " + hinhTron.ChuVi());
                    System.out.println("Diện tích hình tròn: " + hinhTron.DienTich());
                    break;
                case 2:
                    System.out.print("Nhập cạnh hình vuông: ");
                    double canhVuong = scanner.nextDouble();
                    HinhVuong hinhVuong = new HinhVuong(canhVuong);
                    System.out.println("Chu vi hình vuông: " + hinhVuong.ChuVi());
                    System.out.println("Diện tích hình vuông: " + hinhVuong.DienTich());
                    break;
                case 3:
                    System.out.print("Nhập chiều dài của hình chữ nhật: ");
                    double chieuDai = scanner.nextDouble();
                    System.out.print("Nhập chiều rộng của hình chữ nhật: ");
                    double chieuRong = scanner.nextDouble();
                    HinhChuNhat hinhChuNhat = new HinhChuNhat(chieuDai, chieuRong);
                    System.out.println("Chu vi hình chữ nhật: " + hinhChuNhat.ChuVi());
                    System.out.println("Diện tích hình chữ nhật: " + hinhChuNhat.DienTich());
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        }

        scanner.close();
    }
}


