import java.util.*;

public class Exception3
{
    public static void main(String x[])
    {  try{
        Scanner xyz=new Scanner(System.in);
    
        int a[]=new int[2]; //here we declare array of two size index 0 and 1
        for(int i=0;i<a.length;i++)
        {
            a[i]=xyz.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
        System.out.println("elements in array "+a[i]);
        }
        a[2]=100;//here we store value at third index which  is not present in array

        System.out.println("value at a[2] is"+a[2]);  

        }

        catch(ArrayIndexOutOfBoundsException ex)  //or we can write exception ex
        {
            System.out.println("erroe is "+ex);
        }
    }
}