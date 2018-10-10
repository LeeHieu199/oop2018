package week4.task1;

public class CamThanhPhong extends Cam{
    private String Mausac;
    private String Xuatxu;

    public String Mausac() {
        return Mausac;
    }

    public void setMausac(String mausac) {
        Mausac = mausac;
    }

    public String getXuatxu() {
        return Xuatxu;
    }
    public void setXuatxu(String xuatxu){
        Xuatxu = xuatxu;
    }
    /**
     * kiểm tra xem cam có đủ điều kiện xuất khẩu
     * @param mausac là màu của vỏ quả cam
     * @return  true nếu đủ điều kiện và false nếu không
     */
    public boolean mausac(String mausac){
        if(mausac == " xanh ") return true;
        else return false;

    }
    /**
     * kiểm tra xem cam có phải xuất xứ Trung Quốc
     * @param xuatxu là xuất xứ của quả cam
     * @return  true nếu đúng và false nếu không
     */
}
