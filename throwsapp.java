import java.util.*;

class Div{
    int x,y,c;

    void setvalue(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    int getresult() throws Exception 
    {
         c=x/y;
         return c;
    }
}

public class throwsapp
{
    public static void main(String x[])
    {   
    
        Scanner xyz=new Scanner (System.in);
        int a=xyz.nextInt();
        int  y=xyz.nextInt();
        Div v=new Div();
        v.setvalue(a,y); 
        try
        {
          int result=v.getresult();
          System.out.println("ans is: "+result);
        }

        catch(Exception ex)
        {
            System.out.println("error is: "+ex);
        }

    }
}