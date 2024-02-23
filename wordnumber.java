import java.util.*;
public class wordnumber
{
    public static void main(String x[])
    {
        int no,rem,rem1,rev=0,temp;
        Scanner sc=new Scanner(System.in);
        no=sc.nextInt();
         temp=no;
        while(temp!=0)
        {
            rem1=temp%10;
            temp=temp/10;
            rev=rev*10+rem1;
        }
        no=rev;
        do{
              rem=no%10;
            switch(rem)
            {
                  case 1:
                  {
                     System.out.println("one");
                  }
                  break;
                  case 2:
                  {
                    System.out.println("two");
                  }
                  break;
                  case 3:
                  {
                    System.out.println("three");
                  }
                  break;
                  case 4:
                  {
                    System.out.println("four");
                  }
                  break;
                  case 5:
                  {
                    System.out.println("five");
                  }
                  break;
                  case 6:
                  {
                    System.out.println("six");
                  }
                  break;
                  case 7:
                  {
                    System.out.println("seven");
                  }
                  break;
                  case 8:
                  {
                    System.out.println("eight");
                  }
                  break;
                  case 9:
                  {
                    System.out.println("nine");
                  }
                  break;
            }

            no=no/10;

        }while(no!=0);

    
    }
}