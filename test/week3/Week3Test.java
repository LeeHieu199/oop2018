package week3;

import org.junit.Assert;
import org.junit.Test;
public class Week3Test {
    @Test
    // TODO: Viết 5 testcase cho phương thức max()
    public void TestMax(){
        Assert.assertEquals(10,Week3.max(10,-4));
        Assert.assertEquals(100,Week3.max(10,100));
        Assert.assertEquals(-9,Week3.max(-15,-9));
        Assert.assertEquals(20,Week3.max(20,18));
        Assert.assertEquals(21,Week3.max(21,11));
    }


    // TODO: Viết 5 testcase cho phương thức minOfArray()
    @Test
    public void TestMin(){
        int array1[] = {1,-13};
        Assert.assertEquals(-13,Week3.minOfArray(array1));
        int array2[] = {0,1,2,3,4,5};
        Assert.assertEquals(0,Week3.minOfArray(array2));
        int array3[] = {-12,-10-14,-999,1999};
        Assert.assertEquals(-999,Week3.minOfArray(array3));
        int array4[] = {21,11,1999};
        Assert.assertEquals(11,Week3.minOfArray(array4));
        int array5[] = {30,9,2018};
        Assert.assertEquals(9,Week3.minOfArray(array5));
    }

    // TODO: Viết 5 testcase cho phương thức calculateBMI()
    @Test
    public void TestBMI(){
        Assert.assertEquals("Thiếu cân",Week3.calculateBMI(55,1.75));
        Assert.assertEquals("Thiếu cân",Week3.calculateBMI(59,1.80));
        Assert.assertEquals("Bình thường",Week3.calculateBMI(65,1.75));
        Assert.assertEquals("Thừa cân",Week3.calculateBMI(75,1.75));
        Assert.assertEquals("Béo phì",Week3.calculateBMI(70,1.65));
    }
}
