import java.util.*;



class Employee1{
    int id,salary;
    int incrsalary,totalsalary;
    String name;
    void setpersonalinfo(int id ,int salary,String name)
    {
        this.id=id;
        this.salary=salary;
        this.name=name;
    }

    void setprogress(int progress)
    {
        if(progress>60)
        {
            incrsalary=((salary*30)/100);
            totalsalary=salary+incrsalary;
        }
    }
    void showdata()
    {
        System.out.println("emp id\t"+id);
        System.out.println("emp salary\t"+salary);
        System.out.println("emp name\t"+name);
        System.out.println("emp incremented salary\t"+incrsalary);
        System.out.println("emp total salary\t"+totalsalary);
    }

}
public class Personalemp
{
    public static void main(String x[])
    {    
          int id ,salary,progress;
    
         Scanner xyz=new Scanner(System.in);
         System.out.println("enter a name id  salary and progress of employee");
         String name=xyz.nextLine();
         id=xyz.nextInt();
         salary=xyz.nextInt();
         progress=xyz.nextInt();

         Employee1 emp=new Employee1();
         emp.setpersonalinfo(id,salary,name);
         emp.setprogress(progress);
         emp.showdata();



    }
}