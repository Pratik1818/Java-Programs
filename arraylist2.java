import java.util.*;
public class arraylist2 {
     public static void main(String x[])
     {
        ArrayList<Integer>al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        Iterator <Integer> it=al.iterator();
        while(it.hasNext())
        {
            Object obj=it.next();
            System.out.println(obj);

        }
     }
}
