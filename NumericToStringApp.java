public class NumericToStringApp
{
   public static void main(String x[])
   {
     String s="12345";
     int value;
     int no=0;

     for(int i=0;i<s.length();i++)
     {
        char ch =s.charAt(i);
       // System.out.println((int)ch);
        if(ch>=48 && ch<=57)
        {    
            value= (int)ch-48;
            no=no*10+value;


        }
     }

     System.out.println("numeric value is "+no);
   }

   int i=56789;
   String s=String.valueOf(i);
   //System.out.print(s);

}