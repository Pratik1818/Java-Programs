public class swap
{
    public static void main(String x[])
    {
        int a ,b;
        a=Integer.parseInt(x[0]);
        b=Integer.parseInt(x[1]);
        System.out.printf("Before swapping A=%d B=%d\n",a,b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.printf("After swapping A=%d B=%d",a,b);



    }
}