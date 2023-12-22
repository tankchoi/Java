package pkg;

public class HinhVuong {
    private double canh; 

    public HinhVuong() {
        this(0);
    }

    public HinhVuong(double a) {
        this.canh = a;
    }

    public double ChuVi() {
        return 4 * canh;
    }

    public double DienTich() {
        return canh * canh;
    }
}
