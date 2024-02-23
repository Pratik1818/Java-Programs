class B{
   B()
   { this(10);
     System.out.println("i am a default constructor");

   }
   B(int x)
   {   this(4.5f);
      System.out.println("i am a integer para constructor"+x);
   }
   B(float x)
   {
     System.out.println("i am a float para constructor"+x);

   }
}
public class constructorthis
{


public static void main(String x[])
{
    B a=new B();
}
}