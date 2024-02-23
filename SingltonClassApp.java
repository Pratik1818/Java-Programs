class Singlton
{
    private static Singlton st=null;

    private Singlton()
    {
       // System.out.println("hello");
    }

    public static Singlton getinstance()
    {
       
        if(st==null)
        {
             st=new Singlton();
        }
        return st;
    }
}

public class SingltonClassApp
{
    public static void main(String x[])
    {
        Singlton s=Singlton.getinstance();
        Singlton y=Singlton.getinstance();
        Singlton z=Singlton.getinstance();
        System.out.println("hascode of s is "+s.hashCode());
        System.out.println("hascode of y is "+y.hashCode());
        System.out.println("hascode of z is "+z.hashCode());
    }
}