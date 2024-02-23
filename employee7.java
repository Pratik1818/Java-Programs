import java.util.*;
class data{
    int id;
    String name;
    int salary;
    data(int id,int salary,String name)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;


    }
    void display()
    {
        System.out.println(+id+"\t"+name+"\t"+salary);
    }

}
public class employee7
{
    public static void main(String x[])
    {
        data dt[]=new data[3];
        Scanner xyz=new Scanner(System.in);
        for(int i=0;i<dt.length;i++)
        {    
            System.out.println("enter a id name and salary");
           
            int id=xyz.nextInt();
            int salary=xyz.nextInt();
            String name=xyz.nextLine();
            dt[i]=new data( id,salary,name);

        }

        for(int i=0;i<dt.length;i++)
        {
            dt[i].display();
        }
    }
}