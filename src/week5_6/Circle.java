package week5_6;

import java.awt.*;

public class Circle extends Shape{
    private Point center;
    private double rad;
    private final static double PI=3.14;

    /**
     * hàm khởi tạo có 2 biến
      * @param center tâm hình tròn
     * @param rad bán kính hình tròn
     */
    public Circle(Point center, double rad){
        this.center = center;
        this.rad = rad;
    }

    /**
     * phương thức thiết lập tâm hình tròn
     * @param center tâm hình tròn
     */

    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * phương thức lấy giá trị tâm đường tròn
     * @return tâm đường tròn
     */

    public Point getCenter() {
        return center;
    }

    /**
     * phương thức thiết lập giá trị bán kính đường tròn
     * @param rad bán kính
     */
    public void setRad(double rad) {
        this.rad = rad;
    }

    /**
     * phương thức lấy bán kính đường tròn
     * @return bán kính
     */

    public double getRad() {
        return rad;
    }
}

