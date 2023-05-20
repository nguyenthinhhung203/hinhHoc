package Interface.hinhHoc;

public class hinhVuong implements hinhHoc{

    private double canh;

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public hinhVuong(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return canh * 4;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }
}
