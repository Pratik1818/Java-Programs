public class Stringupper
{
    public static void main(String x[])
    {  
         String s="abcdefg";
         System.out.println(s.hashCode());
         s= s.toUpperCase();
         System.out.println("after declaring same variable "+s.hashCode());
         System.out.println(s);

    }
}