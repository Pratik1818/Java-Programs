import java.util.*;

class Student1 
{
    int std[];
    int aggper;
    int Msum=0;
    int count=0;
    void setsubjectmark(int a[])
    {
        std=a;
    }

    void calculateper()
    {   
        for(int i=0;i<std.length;i++)
        {
              Msum=Msum+std[i];
              count++;
        }

        aggper=Msum/count;

    }


    void checkgrades()
    {
        if(aggper>75 && aggper<=100)
        {
            System.out.println("Distinction");
        }
        else if(aggper>60 && aggper<=75)
        {
            System.out.println("first class");
        }
        else if(aggper>50 && aggper<=60)
        {
            System.out.println("second class");
        }
        else if(aggper>40 && aggper<=50)
        {
            System.out.println("third class");
        }
        else if(aggper<40)
        {
            System.out.println("Failed");
        }
   }
}

 public class Studentmark
 {
    public static void main(String x[])
    {
        Scanner abc= new Scanner(System.in);
        int a[]=new int[6];
        System.out.println("Enter a marks of six students");
        for(int i=0;i<a.length;i++)
        {
            a[i]=abc.nextInt();
        }

        Student1 sd=new Student1();
        sd.setsubjectmark(a);
        sd.calculateper();
        sd.checkgrades();

     }
}