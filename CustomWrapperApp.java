import java.util.*;
public class CustomWrapperApp
{
    public static void main(String x[])
    {    Scanner sc =new Scanner(System.in);
        int choice;
        do{

            System.out.println("1.primitive to refreances");
            System.out.println("rferances to primitive");
            System.out.println("refereances to referances");

            System.out.println("enter your chpoie");
            choice=sc.nextInt();

            switch (choice) {
                case 1:
                    {
                        System.out.println("primitve to referance conversion");
                         int i=10;
                         Integer i1=Integer.valueOf(i);
                         System.out.println(i);
                    }
                    break;
                    case 2:
                    {
                        System.out.println("referance to primitive ");
                        Integer i1=10;
                        int i2=i1;
                        System.out.println(i2);
                    }
                    break;

                    case 3:
                    {
                        System.out.println("refreance to referance conversion");
                        Integer i=10;
                        Object o= Integer.valueOf(i);
                        System.out.println(o);
 
                    }
                    break;
            
                default:
                {
                    break;
                }
            }






        }while(true);
    }
}