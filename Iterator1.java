import java.util.*;

public class Iterator1
{
    public static void main(String x[])
    {
      ArrayList al=new ArrayList();
      al.add(100);
      al.add(200);
      al.add(300);
     int size=al.size();
     System.out.println("size of Arraylist is "+size);
      Iterator it=al.iterator();
      
      while(it.hasNext())
      {
         Object obj=it.next();
         System.out.println(obj);
      }
      //check element present in collection or not
      boolean b=al.contains(200);
      if(b)
      {
        System.out.println("element is present");
      }

      else{
         System.out.println("element is not present");
      }
     //check collection is empty or not
       boolean b1 =al.isEmpty();
      if(b1)
      {
        System.out.println("collection is empty");
      }

      else{
         System.out.println("collection is  not empty");
      } 
    }
}