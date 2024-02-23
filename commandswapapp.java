public class commandswapapp
{

  public static void main(String x[])
  {
    int a,b;
    System.out.println("enter a value of a and b");
     a=Integer.parseInt(x[0]);
     b=Integer.parseInt(x[1]);
    System.out.println("before swapping "+a+"\t"+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("after swapping "+a+"\t"+b);


  }

}