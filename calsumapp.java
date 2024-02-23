//method with variable argument

class calsum
{
   void findsum(int ...x)
   {
      int s=0;
      for(int i=0;i<x.length;i++)
      {
        s=s+x[i];
      }
      System.out.printf("Sum of all integer is %d\n",s);
   }
}

class calsumapp
{
   public static void main(String x[])
   {
      calsum cs=new calsum();
      cs.findsum(10,20,30,40,50,60);
   }
}