package week4.task1;

public class HoaQua {
    private String name;
    private double price;
    private double weight;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    /**
     * phương thức trả về tổng giá trị hoa quả
     * @return  tổng giá trị hoa quả = giá * khối lượng.
     */
    public double Total(){
        return price * weight;
    }
    /**
     * phương thức kiểm tra xem hoa quả này có phải cam không
     * @param name là tên hoa qua
     * @return  true nếu có và false nếu không
     */
    public boolean Name(String name){
        if (name == " Cam Thanh Phong") return true;
        return false;
    }
}
