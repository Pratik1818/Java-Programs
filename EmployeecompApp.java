 import java.util.*;
class Employee
{
     private int id;
     private String name ;
     private String Designation;
     private int salary;

     void  setId(int id)
     {
        this.id=id;
     }
     int getId()
     {
        return id;
     }

     void setName(String name)
     {
        this.name=name;
     }

     String getName()
     {
        return name;
     }

     void setDesignation(String Designation)
     {
        this.Designation=Designation;
     }

     String  getDesignation()
     {
        return Designation;

     }

      void  setSalary( int salary)
     {
        this.salary=salary;
     }

     int getSalary()
     {
        return salary;
     }

}

class company
{
    Employee emp[];

    company(Employee ...emp)
    {
        this.emp=emp;
    }

    void sortemployee()
    {
        for(int i=0;i<emp.length;i++)
        {
            for(int j=i+1;j<emp.length;j++)
            {
                if(emp[i].getSalary()>emp[j].getSalary())
                {
                   Employee temp= emp[i];
                   emp[i]=emp[j];
                   emp[j]=temp;
                }
            }
        }

        System.out.println("all data in employee");

        for(int i=0;i<emp.length;i++)
        {
            System.out.println(emp[i].getId()+"\t"+emp[i].getName()+"\t"+emp[i].getSalary()+"\t"+emp[i].getDesignation());
        }
    }
}

public class  EmployeecompApp
{
   public static void main(String x[])
   {  int id;
     String name ;
     String Designation;
     int salary;

      Employee emp[]=new Employee[3];
      for(int i=0;i<emp.length;i++)
      {  emp[i]=new Employee();
         Scanner sc =new Scanner(System.in);
        System.out.println("enter  name designation  id amd salary of the employee");

        name=sc.nextLine();
        Designation=sc.nextLine();
        id=sc.nextInt();
        salary=sc.nextInt();
        emp[i].setName(name);
        emp[i].setDesignation(Designation);
        emp[i].setId(id);
        emp[i].setSalary(salary);

      }

      company cp=new company(emp);
      cp.sortemployee();
   }

}