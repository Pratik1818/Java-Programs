import java.util.*;
public class Strongnumber
{
    public static void main(String x[])
    {   
        Scanner sc =new Scanner (System.in);
        int no,temp,rem;
        int fact;
        int sfact=0;
        System.out.println("Enter a number");
        no=sc.nextInt();
        temp=no;
        while(no!=0)
        {  fact=1;
           rem=no%10;
           no=no/10;
           for(int i=1;i<=rem;i++)
           {
             fact=fact*i; 
           }
           sfact=sfact+fact;
           System.out.println(sfact);

        }

        no=temp;
        if(no==sfact)
        {
            System.out.println("given number is strong");

        }

        else{
            System.out.println("given number is not strong");
        }

        

    }
}