import java.util.*;
class Reactangle{
    int len,wid,area;
    void setvalue(int len,int wid)
    {
        this.len=len;
        this.wid=wid;
    }

    void showarea()
    {
       area=len*wid;
       System.out.println("area of reactangle is\n"+area);
    }
}
public class ReactangleareaApp
{
    public static void main(String x[])
    {   int len,wid;
        Scanner abc=new Scanner (System.in);
        System.out.println("enter a length and width of reactangle");
        len=abc.nextInt();
        wid=abc.nextInt();
        ReactangleApp re=new ReactangleApp();
        re.setvalue(len,wid);
        re.showarea();

        
    }
}