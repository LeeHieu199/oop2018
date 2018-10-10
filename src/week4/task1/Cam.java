package week4.task1;

public class Cam extends HoaQua{
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
     * phương thức kiểm tra xem cam còn hạn sử dụng không
     * @param day là số ngày đã trôi qua
     * @return  true nếu còn và false nếu không còn
     */
    public boolean hsd(int day){
        if(day < HSD) return true;
        else return false;
    }
    /**
     * phương thức kiểm tra xem có cùng loại cam hay không
     * @param cam1 đối tượng cam
     * @return  true nếu cùng và false nếu không
     */
    public boolean same(Cam cam1){
        return (this.Type.equals(cam1.Type));
    }
}
