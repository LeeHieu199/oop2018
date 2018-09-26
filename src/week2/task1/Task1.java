public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a,
        while (a!=b)
        {
            if(a>b) a = a - b;
            else b  =b - a;
        }
        return (a);
    }
    public static int fibonacci(int n)
    {

        if (n==1) return  0;
        if (n==2) return  1;
        if (n==3) return  1;
        else return fibonacci(n-1) + fibonacci(n-2);

    }



    public static void main(String[] args)
    {
        int a=5,b=40;
        int UCLN = gcd(a,b);
        System.out.println("uoc chung lon nhat la "+UCLN);
        System.out.println(+fibonacci(5));
    }
}