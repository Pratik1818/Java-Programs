import java.util.*;
class Duck
{
    int no;
    Duck(int no)
    {
        this.no=no;
    }

    boolean checkduck()
    {   
        boolean flag=false;
        while(no!=0)
        {
            if(no%10==0)
            {
                flag=true;
                break;
            }
            no=no/10;
        }
        if(flag)
        {
            return true;
        }
        else{
            return false;
        }
    }
}

public class CheckDuckApp
{
    public static void main(String x[])
    {   int no;
        Scanner xyz=new Scanner (System.in);
        System.out.println("enter a number");
        no=xyz.nextInt();
        Duck D=new Duck(no);
       boolean b= D.checkduck();
       if(b)
       {
        System.out.println("number is Duck");
       }
       else{
        System.out.println("no is not duck");
       }

    }
}