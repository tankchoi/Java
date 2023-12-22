package pkg;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat() {
        this(0, 0);
    }

    public HinhChuNhat(double dai, double rong) {
        this.chieuDai = dai;
        this.chieuRong = rong;
    }

    public double ChuVi() {
        return 2 * (chieuDai + chieuRong);
    }

    public double DienTich() {
        return chieuDai * chieuRong;
    }
}

