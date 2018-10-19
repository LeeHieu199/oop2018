package week5_6;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(){

    }
    /**
     * hàm tạo có 2 tham số
     * @param width là chiều rộng
     * @param height là chiều dài
     */

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;

    }

    /**
     * phương thức thiết lập giá trị chiều rộng
     * @param width là chiều rộng hcn
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * phương thức lấy giá trị chiều rộng
     * @return chiều rộng của hcn
     */
    public double getWidth() {
        return width;
    }

    /**
     * phương thức thiết lập chiều dài của hcn
     * @param height chiều dài hcn
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * phương thức tả về giá trị chiều dài của hcn
     * @return chiều dài
     */
    public double getHeight() {
        return height;
    }
}
