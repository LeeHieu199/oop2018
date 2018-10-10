package week4.task2;

public class Rectangle extends Shape{
    private double width;
    private double length;

    /**
     * Hàm tạo không có tham số
     * giá trị mặc định của width = 1.0 và length = 1.0
     */
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }
    /**
     * Hàm tạo có 2 tham số
     * @param width là chiều rộng
     * @param length là chiều dài
     */
     public Rectangle(double width, double length){
         this.width = width;
         this.length = length;
     }
    /**
     * Hàm tạo có 4 tham số là thuộc tính của hình chữ nhật
     * @param width là chiều dài
     * @param length là chiều dài
     * @param color là màu sắc
     * @param filled thuộc tính filled
     */
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;

    }
    /**
     *  Phương thức lấy giá trị của chiều rộng
     * @return chiều rộng của hình chữ nhật
     */
    public double getWidth(){
        return width;
    }
    /**
     * phương thức cài đặt giá trị chiều rộng
     * @param width là giá trị chiều rộng
     */
    public void setWidth(double width) {
        this.width = width;
    }
    /**
     * Phương thức lấy giá trị và thiết lập giá trị cho chiều dài
     * @param length là chiều dài ta muốn thiết lập
     */
    public void setLength(double length) {
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    /**
     * phương thức tính diện tích hình chữ nhật
     * @return diện tích hcn
     */
    public double getArea(){
        return width * length;
    }
    /**
     * phương thức tính chu vi hcn
     * @return ra chu vi hcn
     */
    public double getPerimeter(){
        return (this.width + this.length) * 2;
    }
}
