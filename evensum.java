public class evensum
{
    public static void main(String x[])
    {
        int limit,i,sum=0;
        limit=Integer.parseInt(x[0]);
        for(i=1;i<=limit;i++)
        {
            if(i%2==0)
            {    
                sum=sum+i;
            }
        }

        System.out.printf(" Sum of even number is %d",sum);
    }
}