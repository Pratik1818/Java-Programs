import java.util.*;
class converttoupper
{
    char c[];

    void setchar(char ch[])
    {
        c=ch;
    }

    void converttoupper()
    {   
        if(c[0]>='a' && c[0]<='z')
        {
           c[0]= (char)((int)c[0]-32);

           System.out.println("uppper case char is: " +c[0]);
        }
    }

}

public class converttoupperapp
{
    public static void main(String x[])
    {   char c[]=new char[1];  
        Scanner xyz =new Scanner(System.in);
          System.out.println("enter a character");
        c[0]=xyz.next().charAt(0);

        converttoupper cp=new converttoupper();
        cp.setchar(c);
        cp.converttoupper();


    }
}