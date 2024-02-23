import java.util.*;

public class ExceptionSwitchApp{
        static int a[];
    public static void main(String x[])
    {    Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("1.arithmetic Exception");
            System.out.println("ArrayIndexOutofboundException");
              System.out.println("3.NullPointerException");
              System.out.println("4.classNotFoundeException");
              System.out.println("5.NumberFormatException");
              System.out.println("6.InputMissMatchException");

              System.out.println("enter your choice");
              choice=sc.nextInt();
              switch(choice)
              {
                case 1:
                {
                   int a=10;
                   int b=0;
                   int c;
                   try{
                       c=a/b;
                   }
                   catch(ArithmeticException ex)
                   {
                     System.out.println("arithmetic exception"+ex);
                   }
                }
                break;

                case 2:
                {
                    int b[]=new int[2];
                    try{
                        b[2]=10;
                    }
                    catch(ArrayIndexOutOfBoundsException ex)
                    {
                        System.out.println(ex);
                    }
                }

                break ;
                case 3:
                {
                   try{

                     a[0]=100;
                    System.out.println(a[0]);
                   }
                   catch(Exception ex)
                   {
                    System.out.println(ex);
                   }
                }
                case 4:
                {
                    try{
                          Class.forName("dosent exist");
                    }
                    catch(Exception ex){
                        System.out.println(ex);
                    }
                }
                break;
                case 5:
                {   
                    try{

                    
                    String s="12345 ";
                    int i= Integer.parseInt(s);
                   System.out.println(i);

                    }

                    catch(NumberFormatException ex)
                    {
                       System.out.println(ex);
                    }
                }
                break;
                case 6:
                {
                    try{
                        int i;
                        System.out.println("enter a integer value");
                        i=sc.nextInt();
                    }
                    catch(InputMismatchException ex)
                    {
                        System.out.println(ex);
                    }
                }
                break ;
              }




        }while(true);
    }
}