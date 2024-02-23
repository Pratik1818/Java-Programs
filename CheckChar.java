import java.util.*;
public class CheckChar

{
    public static void main(String x[])
    {
       char ch;
       Scanner xyz=new Scanner(System.in);
       System.out.println("enter a character");
       ch=xyz.next().charAt(0);
       if((ch>=65 && ch<=90) || (ch>=97&& ch<=122))
       {
        System.out.println("character is alphabet "+ch);
       }
       else if(ch>=48 &&ch<=57)
       {
        System.out.println("character is number "+ch);
       }

       else
       {
        System.out.println("character is spacial symbol "+ch);
       }



    }
}