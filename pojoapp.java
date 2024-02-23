import java.util.*;
class product
{
    private int id;
    private int price;
    private String name;

    public void setId(int id)
    {
        this.id=id;

    }
    public int getId()
    {
        return id;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public int getPrice()
    {
        return price;
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

class shop{
    product p[];
    int tprice=0;

    public void setshopdetails(product ...p)
    {
        this.p=p;
    }

    public void show()
    {
       for(int i=0;i<p.length;i++)
       {
         System.out.printf("%d \t %d\t %d\t \n",p[i].getName(),p[i].getPrice() ,p[i].getName());
         tprice=tprice+p[i].getPrice();
       }
       System.out.printf(" total price is %d",tprice);
    }
}

public class pojoapp
{
    public static void main(String x[])
    {
        
       product p[]=new product[4];
       for(int i=0;i<p.length;i++)
       { 
         p[i]=new product();
        System.out.printf("enter a name id and price\n");
         Scanner xyz=new Scanner(System.in);
          String name=xyz.nextLine();
         int id=xyz.nextInt();
          int price=xyz.nextInt();
          
          p[i].setName(name);
          p[i].setId(id);
          p[i].setPrice(price);
       }

       shop s =new shop();
       s.setshopdetails(p);
       s.show();
    }
}