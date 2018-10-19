package week5_6;

import java.awt.*;

public class Tringale extends Shape{
    private Point top1, top2 ,top3;

    /**
     * hàm khởi tạo hình tam giác có 3 tham số là 3 đỉnh
     * @param top1
     * @param top2
     * @param top3
     */
    public Tringale(Point top1, Point top2, Point top3){
        this.top1 = top1;
        this.top2 = top2;
        this.top3 = top3;
    }

    /**
     * phương thức lấy tọa độ đỉnh thứ nhất của tam giác
     * @return tọa độ 1 đỉnh tam giác
     */
    public Point getTop1() {
        return top1;
    }

    /**
     * phương thức thiết lập đỉnh thứ nhất của tam giác
     * @param top1
     */
    public void setTop1(Point top1) {
        this.top1 = top1;
    }

    /**
     * phương thức lấy tọa độ thứ 2 của tam giác
     * @return tọa đọ đỉnh tam giác
     */
    public Point getTop2() {
        return top2;
    }

    /**
     * phương thức thiết lập đỉnh thứ hai của tam giác
     * @param top2
     */
    public void setTop2(Point top2) {
        this.top2 = top2;
    }

    /**
     * phương thức lấy tọa độ đỉnh thứ 3 của tam giác
     * @return tọa độ đỉnh 3
     */
    public Point getTop3() {
        return top3;
    }

    /**
     * phương thức thiết lập đỉnh thứ 3 của tam giác
     * @param top3
     */
    public void setTop3(Point top3) {
        this.top3 = top3;
    }
}
