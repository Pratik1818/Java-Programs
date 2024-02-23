
class Employee
{
    private int id;
    private int salary;
    private String name;

    public void setId(int id)
    {
        this.id=id;
    }

    public void setSalary( int salary)
    {
        this.salary=salary;
    }

    public void setName(String name)
    {
        this.name=name;
    }

    public int getId()
    {
        return id;
    }

    public int getSalary()
    {
        return salary;
    }

    public String getName()
    {
        return name;
    }

}

class company
{
    private Employee []employee;
    public void setEmployeeDetails( Employee ...employee)
    {
        this.employee=employee;

    }
   public  void show()
    {    for(int i=0;i<employee.length;i++)
         {

        
          System.out.println(employee[i].getId()+"\t"+employee[i].getSalary()+ "\t" +employee[i].getName());
        }
    }
}

public class Employeeapp
{
    public static void main(String x[])
   {
       company c=new company();
       Employee e=new Employee();
       Employee e2=new Employee();

       e.setId(1);
       e.setSalary(50000);
       e.setName("pratik");
       e2.setId(2);
       e2.setSalary(40000);
       e2.setName("prajyot");
       c.setEmployeeDetails(e,e2);
       c.show();
   }
}