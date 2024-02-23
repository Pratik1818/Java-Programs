import java.util.*;

public class freqcount{
  
    public static void main(String x[])
    {
        int a[]=new int[5];
        int count=0;
        System.out.println("enter a element in array");
        Scanner sc =new Scanner (System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }

        for(int i=0; i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {

                if (a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }

        for(int i=0;i<a.length;i=count+i)
        {    count=0;
            for(int j=i;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                }
            }

            System.out.println("Frequency of"+a[i]+"is"+count);
        }
    }
   
}