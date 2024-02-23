import java.util.*;

public class Frequencycount
{
    public static void main(String x[])
    {
      int no,count=0,temp,rem,rem2,rem1,rem4,temp5;
      int rev=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number");
      no=sc.nextInt();
      
      while(no!=1)
    {  
        temp=no;
         int  temp1=no;
        rem=no%10;
         rem1=rem;

        
        while(temp!=0)
        {
            rem2=temp%10;
          if(rem2-rem1==0)
          {
            count++;
          }
         temp=temp/10;
        }
        rev=0;
        while(temp1!=0)
        {   rem4=temp1 %10;
          if(rem1!=rem4)
          {
              no=rev*10+rem4;
            
          }
          temp1=temp/10;
        }

        System.out.println(no);

        System.out.println("count of "+rem1+ "is"+count);

       
        temp5=no;
         
      }
    }
}