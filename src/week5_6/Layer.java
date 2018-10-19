package week5_6;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Layer extends JPanel {
    private ArrayList<Shape> ListShape;
    public Layer(){
        this.ListShape = new ArrayList<>();
    }


    public Layer(ArrayList<Shape> ListShape){
        this.ListShape = ListShape;

    }

    /**
     * phương thức xóa các đối tượng Triangle thuộc lớp Layer
     *
     */
    public void deleteTriangle(){
        ListIterator<Shape> listIterator = ListShape.listIterator();
        while (listIterator.hasNext()){
            Shape element = listIterator.next();
            if(element instanceof Tringale){
                listIterator.remove();
            }
        }
    }
}
