import java.util.*;
class reactangle
{
    int length;
    int breadth;

    reactangle()
    {
        length=0;
        breadth=0;
    }

    reactangle( int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    reactangle(int no)
    {
        this.length=no;
        this.breadth=no;
    }

    void getarea()
    {
        System.out.println("area of reactangle is "+length*breadth);
    }
}

public  class ReactangleApp{
    public static void main(String x[])
    {
        reactangle r1=new reactangle();
        r1.getarea();
        reactangle r2=new reactangle(10,10);
        r2.getarea();
        reactangle r3=new reactangle(10);
        r3.getarea();



    }
}