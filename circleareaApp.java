import java.util.*;

class circle
{
    int redius;
    float area;
    void setvalue(int redius)
    {
        this.redius=redius;
    }

    void showarea()
    {
         area=3.14f*redius*redius;
         System.out.println("Area of circle is\n"+area);

    }
}



public class circleareaApp
{

  public static void main(String x[])
  {   int redius;
     Scanner xyz=new Scanner(System.in);
     System.out.println("enter a redius");
    
     redius=xyz.nextInt();

     circle cl=new circle();
     cl.setvalue(redius);
     cl.showarea();


  }
}