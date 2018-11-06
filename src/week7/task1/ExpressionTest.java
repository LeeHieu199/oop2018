package week7.task1;

public class ExpressionTest {
    public static void main(String[] args){
        Numeral num10 = new Numeral(10);
        Numeral num2 = new Numeral(2);
        Numeral num1 = new Numeral(1);
        Numeral num3 = new Numeral(3);

        Square square1 = new Square(num10);
        Subtraction subtraction = new Subtraction(square1,num1);
        Multiplication division = new Multiplication(num2,num3);
        Addition addition = new Addition(subtraction,division);
        Square A = new Square(addition);
        System.out.println("A = (10^2 - 1 + 2*3)^2");
        System.out.println("A = " + A.Evaluate());
        try{
            Division division1 = new Division(num2,new Numeral(0));
            System.out.println(division1.Evaluate());
        }catch (ArithmeticException e){
            System.out.println("lỗi chia cho 0");
        }

    }
}
