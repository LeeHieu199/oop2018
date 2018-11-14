package week10;

import java.util.Random;

public class Task2 {
    /**
     * phương thức sắp xếp nổi bọt
     * @param array mảng số thực
     */
    public  static void bubbleSort(double[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    double temp = array[j];
                    array[j]= array[j+1];
                    array[j+1]= temp;
                }
            }
        }
    }

    public static void main(String[] args){
        double[] Array = new  double[1000];
        Random rd = new Random();
        for (int i=0;i<1000;i++){
            Array[i] = rd.nextDouble();
        }
        bubbleSort(Array);
        for (int j=0;j<Array.length;j++){
            System.out.println(Array[j]);
        }
    }
}


