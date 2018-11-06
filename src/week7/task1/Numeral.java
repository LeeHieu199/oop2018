package week7.task1;

public class Numeral extends Expression{
    //khai báo hằng số
    private int value;

    /**
     * khởi tạo hàm có tham số
     * @param value là hằng số
     */
    public Numeral(int value){
        this.value = value;
    }
    public Numeral(){

    }
    @Override
    public String toString(){
        return "";
    }
    @Override
    public int Evaluate(){
        return this.value;
    }

}
