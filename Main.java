package Interface.hinhHoc;

public class Main {
    public static void main(String[] args) {
        hinhVuong hinhVuong = new hinhVuong(4);
        hinhTron hinhTron = new hinhTron(6);
        Drawable drawable =new Drawable();
        drawable.draw(hinhVuong);
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        drawable.draw(hinhTron);
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
    }
}
