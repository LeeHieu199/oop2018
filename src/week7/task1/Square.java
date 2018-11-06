package week7.task1;

public class Square extends Expression{
    private Expression expression;

    /**
     * hàm khởi tạo có một tham số
     * @param expression là một số hoặc một biểu thúc
     */
    public Square(Expression expression){
        this.expression = expression;
    }
    @Override
    public int Evaluate(){
        return expression.Evaluate()*expression.Evaluate();
    }
    @Override
    public String toString(){
        return expression.toString() + "^2";
    }
}
