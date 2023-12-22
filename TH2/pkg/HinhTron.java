package pkg;

public class HinhTron {
    private double banKinh; 

    public HinhTron() {
        this(0);
    }

    public HinhTron(double r) {
        this.banKinh = r;
    }

    public double ChuVi() {
        return 2 * Math.PI * banKinh;
    }

    public double DienTich() {
        return Math.PI * Math.pow(banKinh, 2);
    }
}

