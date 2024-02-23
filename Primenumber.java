import java.util.*;

public class Primenumber
{
    public static void main(String x[])
    {
        int psum=0;
        int limit,i,j;
        int flag=0;
        Scanner sc =new Scanner (System.in);
        System.out.println("enter a limit");
        limit=sc.nextInt();

        for(i=1;i<=limit;i++)
        {   flag=0;
          for(j=2;j<=i/2;j++ )
          {
            if(i%j==0)
            {
                flag=1;
                break;
            }

            
          }
          if(i!=1 && flag!=1)
            {
                psum=psum+i;
            }
        }

        System.out.println("Sum is"+psum);

    }
}