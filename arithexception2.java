 import java.util.*;

 public class arithexception2
 {
  public static void main(String x[])
  {
     Scanner xyz=new Scanner(System.in);
     int a,b,c;
     System.out.println("enter a value of a and b");
     a=xyz.nextInt();
     b=xyz.nextInt();

     try
     {
        c=a/b;
        System.out.println("divition is "+c);

     }

     catch(ArithmeticException ex) //or  we can write Exception ex
     {
        System.out.println("error is "+ex);
     }

  }
 }