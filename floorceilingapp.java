import java.util.*;
public class floorceilingapp
{
    public static void main(String x[])
    {
        Scanner sc=new Scanner (System.in);
        int a[]=new int[6];
        int count=0;
        int j;
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=0;i<a.length;i++)
        {
            for(j=count;j<=a[i];j++)
            {
               if(a[i]==j)
               {
                System.out.println("number"+j+ "ceiling is: "+j+ "floor is "+j);
               }

               else{
                System.out.println("number"+j+ "ceiling is: "+(j+1)+ "floor is "+(j-1));
               }
               count++;
            }
            
        }

    }
}