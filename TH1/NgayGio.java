
import java.util.Date;
import java.util.concurrent.locks.LockSupport;

public class NgayGio {
    public static void main(String[] args) {
        while (true) {
            Date gioHienTai = new Date();
            System.out.printf("\r%td/%tm/%tY %tT", gioHienTai, gioHienTai, gioHienTai, gioHienTai);
            LockSupport.parkNanos(1_000_000_000);
        }
    }
}

