package week4.task2;

public class Shape {
    private String color;
    private boolean filled;

        /**
         * Hàm tạo không có tham số
         * 2 thuộc tính được mặc định giá trị là "Red" và true.
         */
        public Shape(){
            color = "Red";
            filled = true;
        }

        /**
         * Hàm tạo có tham số truyền vào
         * @param color màu sắc muốn khởi tạo
         * @param filled có tô màu hay không
         */
        public Shape(String color, boolean filled){
            this.color = color;
            this.filled = filled;
        }
        /**
         * phương thức lấy màu sắc
         * @return  màu sắc
         */
        public String getColor() {
            return color;
        }

        /**
         * phương thức tạo màu sắc
         * @param color màu sắc cần tạo
         */
        public void setColor(String color) {
            this.color = color;
        }

        /**
         * phương thức kiểm tra có tô màu
         * @return  trả về thuộc tính filled
         */
        public boolean isFilled() {
            return filled;
        }

        /**
         * phương thức tạo giá trị filled
         * @param filled giá trị cần tạo
         */
        public void setFilled(boolean filled) {
            this.filled = filled;
        }
    /**
     * phương thức chuyển sang xâu ký tự
     * @return kiểu hình học mặc định ở đây là Shape.
     */
    public String toString(){
        return "Shape";
    }
    public static void main(String[] args){
        Shape shape = new Shape();
        Circle  Hinhtron = new Circle();
        Rectangle HCN = new Rectangle();
        Square Hinhvuong = new Square();
        System.out.println("Diện tích hình tròn là " + Hinhtron.getArea());
        System.out.println("Chu vi hình chữ nhật là "+ HCN.getPerimeter());
        System.out.println("Chu vi hình vuông là "+ Hinhvuong.getPerimeter());

    }
}
