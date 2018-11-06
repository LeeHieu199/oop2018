package week7.task1;

public abstract class BinaryExpression extends Expression{
    /**
     * trả về biểu thúc thức thứ nhất
     * @return
     */
    public abstract Expression left();
    // trả về biểu thức thứ hai
    public abstract Expression right();

}
