package week4.task2;
// lóp được tạo là con của lớp Recrangle
public class Square extends Rectangle {
    /**
     * phương thức khởi tạo không có tham số
     */
    public Square(){
        super();
    }
    /**
     * phương thức tạo có 1 tham số
     * @param side là độ dài cạnh hình vuông
     */
    public Square(double side){
        super(side,side);
    }
    /**
     * phương thức khởi tạo truyền vào 3 tham số
     * @param side là độ dài cạnh hình vuông
     * @param color là màu sắc
     * @param filled thuộc tính filled
     */
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }
    /**
     * phương thức lấy giá trị của độ dài cạnh hv
     * @return độ dài cạnh hv
     */
    public double getSide(){
        return super.getLength();
    }
    /**
     * thiết lập độ dài cạnh hình vuông
     * @param side là độ dài cạnh hv
     */
    public void setSide(double side){
        super.setLength(side);
    }
    //ghi đè lên kích thước lớp hcn
    @Override
    public void setWidth(double side){
         super.setWidth(side);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }
}
