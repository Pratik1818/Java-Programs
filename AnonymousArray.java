public class AnonymousArray
{ 
     public static void sum(int a[])
    {   int total=0;
        int count=0;
        for(int i=1;i<=a.length;i++)
        {    count++;
            total=total+i;
        }
    }
    public static void main(String x[])
    {
       sum(new int[]{1,2,3,4}); //anonymous array
       sum(new int[]{1,2,3}); 
    }

   
}