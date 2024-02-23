import java.util.*;

public class exception1
{
    public static void main(String x[])
    {
        Scanner xyz=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter a value of a and b");
        a=xyz.nextInt();
        b=xyz.nextInt();

        c=a/b;  //10/0 arithmetic exception occurs
        System.out.println("division is "+c);
    }
}