//this is not example of pojo class this is normal class we will see eaxample of pojo class in next code

class pojo1
{
    private int id; 
    private String name;

    public void setId(int id)
    {
        this.id=id;

    }

    public int getId()
    {
        return id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }

}
public class Studentapp
{
   public static void main(String x[])
   {
     pojo1 pj=new pojo1();
     pj.setId(1);
     pj.setName("pratik");

     int i=pj.getId();
     String n=pj.getName();
     
     System.out.printf("id is %d \n",i);
     System.out.printf("name is %s",n);

   }
}

