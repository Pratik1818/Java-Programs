import java.util.*;

public class uperlowerapp
{
    public static void main(String x[])

    {
        String s="pratik",s1="";
       // Scanner sc=new Scanner (System.in);
       // System.out.println("enter a strring ");
       // s=sc.nextLine();

        int l=s.length();
        for(int i=0;i<l;i++)
        {   //char ch=s.charAt(i);
            if (ch>97 &&ch<=122)
            {
                 ch=(char)((int)ch+32);
                  s1=s1+ch;
            }

        }
        s=s1;

        System.out.println(s1);
    }
}