import java.util.*;
public class jaggedapp
{
    public static void main(String x[])
    {  Scanner xyz=new Scanner(System.in);
      int no=0;
      int count=1;
      System.out.println("enter a number of row");
      no=xyz.nextInt();
       int a[][]=new int[no][];
       
       for(int i=0;i<a.length;i++)
       {    
          a[i]=new int[i+1];
          
       }
       for(int i=0;i<a.length;i++)
       {     

         for(int j=0;j<a[i].length;j++)
         {
            a[i][j]=count++;
            
         }
         System.out.printf("\n");
       }
       for(int i=0;i<a.length;i++)
       {
         for(int j=0;j<a[i].length;j++)
         {
            System.out.printf(+a[i][j]+"\t");
            
         }
         System.out.printf("\n");
       }
        
    }
}