import java.util.*;
public class majority
{
  public static void main(String x[])
  {
    Scanner sc =new Scanner(System.in);
    int a[]=new int[6];
    int count,i;
    boolean flag=false;
    System.out.println("enter a elements in array");
    for(i=0;i<a.length;i++)
    {
       a[i]=sc.nextInt();
    }

    for( i=0;i<a.length;i++)
    {
        for(int j=i+1;j<a.length;j++)
        {
            if(a[i]>a[j])
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }

    }

    for( i=0;i<a.length;i=count+i)
    {
        count=0;
        for(int j=0;j<a.length;j++)
        {
        if(a[i]==a[j])
        {
            count++;
        }
      }
      if(count>a.length/2)
      {
        flag=true;
        break;
      }

      
    }
    if(flag)
    {
        System.out.println(a[i]+ "is majority element");
    }
    else{
        System.out.println("no majority");
      }
  }
}