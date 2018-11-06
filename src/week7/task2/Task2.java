package week7.task2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task2 {
    public static String File_EV = "src\\sampl\\E_V.txt";
    /**
     * thiết lập ngoại lệ NullPointerException
     * @param string là một xâu kí tự
     * @throws NullPointerException ngoại lệ nếu xâu kí tự bằng null
     */
    public void Null(String string) throws NullPointerException {
        if (string.equals("")) throw new NullPointerException();
        System.out.println(string);
    }

    /**
     * thiết lập ngoại lệ ArrayIndexOutOfBoundsException
     * @param A mảng các số
     * @param i số thứ tự phần tử
     * @throws ArrayIndexOutOfBoundsException ngoại lệ khi i không thuộc mảng A
     */
    public void ArrayIndexOut( int A[], int i) throws ArrayIndexOutOfBoundsException{
        //if(i >= A.length || i < 0) throw new ArrayIndexOutOfBoundsException();
        System.out.println(A[i]);
    }

    /**
     *
     * @param a số chia
     * @param b số bị chia
     * @throws ArithmeticException ngoại lệ khi số bị chia = 0
     */
    public void ArithmeticException(int a, int b) throws ArithmeticException{
        //if (b == 0) throw new ArithmeticException();
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        String string = null;
        Task2 task2 = new Task2();
        //
        try {
            task2.Null(string);
        } catch (NullPointerException e) {
            System.out.println("Lỗi NullPointerException");
        }
        //
        int A[] = {1,2,3,4,5};
        try {
            task2.ArrayIndexOut(A,6);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Lỗi ArrayIndexOutOfBoundsException");
        }
        //
        try{
            task2.ArithmeticException(1,0);
        }catch (ArithmeticException e){
            System.out.println("Lỗi ArithmeticException");
        }
        //

        try{
            InputStreamReader input = new InputStreamReader(new FileInputStream(File_EV),"UTF8");
            BufferedReader reader = new BufferedReader(input);
        }catch (IOException e){
            System.out.println("Lỗi IOException ");
        }

    }
}
