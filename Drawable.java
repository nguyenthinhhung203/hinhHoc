package Interface.hinhHoc;

public class Drawable {
    public void draw(hinhHoc hinh) {
        if (hinh instanceof hinhVuong) {
            System.out.println("Vẽ ra HinhVuong[cạnh = " + ((hinhVuong) hinh).getCanh() + "]");
        } else if (hinh instanceof hinhTron) {
            System.out.println("Vẽ ra HinhTron[r = " + ((hinhTron) hinh).getBanKinh() + "]");
        }
    }
}
