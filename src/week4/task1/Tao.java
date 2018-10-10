package week4.task1;

public class Tao extends HoaQua{
    private String Type;
    private int HSD;
    public String getType(){
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }
    public int getHSD(){
        return HSD;
    }

    public void setHSD(int HSD) {
        this.HSD = HSD;
    }
    /**
     * phương thức trả về nguồn gốc táo
     * @param type   loại táo
     * @return  tên của quốc gia xuất khẩu
     */
    public String companyBuyApple(String type){
        if(type == "TaoRockit")  return "Newzealand";
        else if (type == "TaoKinsei") return "Nhật Bản";
        return "Việt Nam";
    }
}
