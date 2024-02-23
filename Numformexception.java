
public class Numformexception
{
    public static void main(String x[])
    {
    try{

    
       String s="12345 ";
       int a=Integer.parseInt(s);  //here we try to convert string value to integer value but it will not convert because string value contain one space at the end if space is not there then it will convert string value to integer value
       System.out.println("value of a is "+a);
    }
    catch(Exception ex)
    {
        System.out.println("error is "+ex);
    }

    }
}