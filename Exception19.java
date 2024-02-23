

import java.util.*;
public class Exception19
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
        }


        } while(choice<=5);

        


     }
}