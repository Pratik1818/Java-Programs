import java.util.*;

public class Jaggedarray
{
    public static void main(String x[])
    {   int i,j;
        int a[][]= new int[3][];
         a[0]= new int[3];
         a[1]= new int[4];
         a[2]= new int[2];

        Scanner xyz=new Scanner(System.in);

        System.out.println("enter a elements in matrix\n");

        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                a[i][j]=xyz.nextInt();
            }

            System.out.println("\n");
        }

        System.out.println("Dispaly matrix\n");

        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.printf("%d \t",a[i][j]);
            }

             System.out.println("\n");
        }
    }
}