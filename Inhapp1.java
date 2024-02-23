class value
{
    int a,b;
    void setvalue(int x,int y)
    {
         a=x;
         b=y;
    }
}
class Add extends value
{
    int getadd()
    {
        return a+b;
    }
}
class Mul extends value
{
     int getmul()
     {
        return a*b;
     }
}

public class Inhapp1
{
    public static void main(String x[])
    {
        Add ad=new Add();
        ad.setvalue(10,20);

        Mul ml=new Mul();
        ml.setvalue(10,30);

        int r1=ad.getadd();
        int r2=ml.getmul();
        System.out.printf("addition is %d\n",r1);
        System.out.printf("multiplication is %d\n",r2);
    }
}