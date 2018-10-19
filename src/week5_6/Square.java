package week5_6;

public class Square extends Rectangle {
    private double side;

    /**
     * hàm khởi tạo có 1 biến
     * @param side cạnh hv
     */
    public Square(double side){
        super(side,side);
    }

    /**
     * phương thức lấy độ dài cạnh hình vuông
     * @return độ dài cạnh
     */
    public double getSide() {
        return this.getHeight();
    }

    /**
     * phương thức thiết lập độ dài cạnh
     * @param side cạnh hv
     */
    public void setSide(double side) {
        super.setHeight(side);
    }
}
