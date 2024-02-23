import java.util.*;
public class exception18
{
      static int arr[];
    public static void main(String x[])

    {     int choice;
        
         Scanner xyz= new Scanner(System.in);

         do{
        System.out.println("Enter your choice");
        choice=xyz.nextInt();
        System.out.println("1.Arithmetic Exception");
        System.out.println("2.ArraayIndexOutOfBoundException");
        System.out.println("3.NullPointerException");
        System.out.println("4.NumberFormatException");
        System.out.println("Input mismatch Exception");

        switch(choice)
        {
            case 1:
            {
                int a,b,c;
                System.out.println("enter a value of a and b");
                a=xyz.nextInt();
                b=xyz.nextInt();
                try{
                    c=a/b;
                    System.out.println("Division is "+c);
                }
                catch(Exception ex)
                {
                    System.out.println("Error is "+ex);
                }

            }
                break;
            case 2:
            {
                int a[]={1,2,3,4,5};
                try{
                    
                    System.out.println("elements in array are ");
                    for(int i=0;i<5;i++)
                    {
                        System.out.println(a[i]);
                    }
                    a[5]=100;
                    System.out.println(a[6]);
                }
                catch(Exception ex)
                {
                     System.out.println("Error is"+ex);
                }
                
            }
            break;

            case 3:
            {
                 
                try{
            
                arr[0]=100;
                System.out.println("element is"+arr[0]);
                }

                catch(Exception ex)
                {
                    System.out.println("error is "+ex);
                }



            }
            break;

            case 4:
            {
                String s="12345 ";

                try{
                    int a=Integer.parseInt(s);  //here we try to convert string value to integer value but due to space it will not convert
                    System.out.println("number is"+a);

                }

                catch(Exception ex)
                {
                    System.out.println("Error is "+ex);
                }
            }
            break;

            case 5:
            {
                try{
                    int a;
                    a=xyz.nextInt();
                    System.out.println(a);

                }
                catch(Exception ex)
                {
                    System.out.println("Error is "+ex);
                }
            }
            break;
            case 6:
            {
                try{
                    char ch;
                    String s="pratik";
                  ch= s.charAt(7);
                  System.out.println(ch);

                }
                catch(StringIndexOutOfBoundsException ex)
                {
                    System.out.println(ex);
                }
            }
            break;
            case 7:
            {
                try{
                    Class.forName("classdosentexist");
                }
                catch(ClassNotFoundException ex)
                {
                    System.out.println("Error is "+ex);
                }
            }
            break;
            case 8:
            {   
                class Thread1 extends Thread{
                int i;
                 public void run()
                {  try{
                    for(int i=1;i<=5;i++);
                    {
                        System.out.println(i);
                        Thread.sleep(2000);

                    }
                  }
                  catch(InterruptedException ex)
                  {
                    System.out.println("Error is"+ex);
                  }
                }
            }
                new Thread1().start();
            }
            break;
            default:
            {
                System.out.println("wrong choice");
            }
        }


        } while(choice<=9);

        


     }
}