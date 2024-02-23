import java.util.*;
public class ArraythreeD
{
    public static void main(String x[])
    {
        Scanner xyz=new Scanner(System.in);
         int i,j;
        int a[][]= new int[3][3];

        System.out.println("Enter a elements in array\n");

        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
             a[i][j]=xyz.nextInt();
            }

            System.out.printf("\n");
        }

        System.out.println("Display matrix\n");

        for(i=0;i<a.length;i++)
        {
            for(j=0;j<a[i].length;j++)
            {
                System.out.printf("%d\t",a[i][j]);
            }

            System.out.printf("\n");
        }

        xyz.close();
    }
}