package week7.task1;

public class Division extends BinaryExpression{
    private Expression left;
    private Expression right;

    /**
     * hàm khởi tạo có 2 biến
     * @param left số thứ nhất
     * @param right số thứ 2
     */
    public Division(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public Expression left(){
        return this.left;
    }

    @Override
    public Expression right(){
        return this.right;
    }
    @Override
    public String toString(){
        return this.left.toString() + "/" + this.right.toString();
    }
    @Override
    public int Evaluate(){
        return this.left.Evaluate() / this.right.Evaluate();
    }
}
