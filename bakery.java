import java.util.*;

class product2
{
	private int id;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	
}
public class bakery{
	
	public static void main(String x[])
	{   int id,price;
	    
		
		
		product2 p[]=new product2[3];
		Scanner xyz= new Scanner(System.in);
		for(int i=0;i<p.length;i++)	
		{  
			p[i]=new product2();
			
			System.out.println("enter a id price and name");
            String name=xyz.nextLine();
			id=xyz.nextInt();
			price=xyz.nextInt();
			
			
			p[i].setId(id);
			p[i].setPrice(price);
			p[i].setName(name);
			
		}
		
		for(int i=0;i<p.length;i++)
		{
			for(int j=i+1;j<p.length;j++)
			{
				if(p[i].getPrice()>p[j].getPrice())
				{
					product2 temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
		
		for(int i=0;i<p.length;i++)
		{
			System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getName());
		}
	}


}