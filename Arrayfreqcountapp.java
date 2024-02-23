import java.util.*;

class arrayfreq
{
    int a[];
    void setvalue(int arr[])
    {
        a=arr;
    }

    void findfreq()
    {    int count=0 ,i,j;
        for( i=0;i<a.length;i++)
        {
            for(j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        for( i=0;i<a.length;i=i+count) 
        {
             count=0;
             for(j=i;j<a.length;j++)
             {
                if(a[i]==a[j])
                {
                    count++;
                }
             }
             System.out.println("freqency of " +a[i]+" is:"+count);
        }

    }
}

public class Arrayfreqcountapp
{
    public static void main(String x[])
    {   int a[]=new int[7];
        Scanner xyz = new Scanner (System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=xyz.nextInt();
        }

        arrayfreq af=new arrayfreq();
        af.setvalue(a);
        af.findfreq();


    }
}