import java.util.*;
public class Transporsematrix
{
    public static void main(String x[])
    {   Scanner sc=new Scanner (System.in);
        int a[][]=new int[2][2];System.out.println("enter a element iin array");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0 ;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
           System.out.print("\n");
        } 
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0 ;j<a[i].length;j++)
            {
                System.out.print(+a[i][j]);
            }
            System.out.print("\n");
        } 

        System.out.println("transporse of matricx is");

        for(int i=0;i<a.length;i++)
        {
            for(int j=0 ;j<a[i].length;j++)
            {
               int  temp=a[i][j];
               a[i][j]=a[j][i];
               a[j][i]=temp;
            }
        }

        for(int i=0;i<a.length;i++)
        {
            for(int j=0 ;j<a[i].length;j++)
            {
                System.out.print(+a[i][j]);
            }
            System.out.print("\n");
        
        } 

        
        
    }
}