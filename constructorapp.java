class A{
    int x,y;
     A(int x,int y)
    {
       this.x=x;
       this.y=y;
    }

}

class B extends A{
    int z;
    B(int x,int y,int z)
    {
        super(x, y);
        this.z=z;
        System.out.println("x= "+x+" y= "+y+" z= "+z);
    }
}

public class constructorapp
{
    public static void main(String x[])
    {
        B b=new B(10,20,30);
    }
}