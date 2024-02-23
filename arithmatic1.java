public class arithmatic1{

   public static void main(String arg[])
   {
      int a=0,b=0,c=0;
      a=Integer.parseInt(arg[0]);
      b=Integer.parseInt(arg[1]);
      c=a+b;
      System.out.printf("addition is ",+c);

      c=a-b;
      System.out.printf("substaction is ",+c);

      c=a*b;
      System.out.printf("multiplication is",+c);

      c=a/b;
      System.out.printf("division is ",+c);
   }
}