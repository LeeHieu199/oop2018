package week5_6;

import java.awt.*;

public class Shape {
    private String color;
    private boolean filled;
    protected int x,y;
    protected int Vx, Vy;
    public Shape(){};

    /**
     * hàm khởi tạo có 2 tham số
     * @param color màu săc hình
     * @param filled có tô màu hay không
     */
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    /**
     * phương thức lấy màu sắc
     * @return màu của hình
     */
    public String getColor() {
        return color;
    }

    /**
     * phương thức thiết lập màu của hình
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * kiểm tra xem có tô màu
     * @return trả về thuộc tính filled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * phương thức tạo gia trị filled
     * @param filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Shape(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void setVx(int Vx){
        this.Vx = Vx;
    }

    public int getVx() {
        return Vx;
    }

    public void setVy(int vy) {
        Vy = vy;
    }

    public int getVy() {
        return Vy;
    }
    public void Creat(){

    }
}
