import java.util.*;
public class rotatearray
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[11];
        int b[]=new int[a.length];
        int pos;
        System.out.println("enter a position");
        pos=sc.nextInt();
        System.out.println("enter a element in array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length-pos;i++)
        { b[i]=a[pos+i];
        
        }

        for(int i=a.length-pos;i<a.length;i++)
        {
            b[i]=a[i-(a.length-pos)];
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.print(b[i]+"\t");
        }
    }
}