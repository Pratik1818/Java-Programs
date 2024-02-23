import java.util.*;

class Employee5{
    int id;
    String name;
    int totalworkinghr;
    int salary;
   int overtime;
   Employee5(String name,int id,int totalworkinghr,int salary)
   {
    this.id=id;
    this.name=name;
    this.totalworkinghr=totalworkinghr;
    this.salary=salary;
   }

   void DisplayInformation()
   {
      System.out.println(name+"\t"+id+"\t"+totalworkinghr+"\t"+salary);
   }
}

 class overtime{
    Employee5 emp[];
    void setemployee(Employee5 emp[])
    {
        this.emp=emp;
    }

    void calculateovertime()
    {     int  totalworkinghr=0;
        int overtimepay;
        int overtime;
    
        for(int i=0;i<emp.length;i++)
        {   System.out.println("Totalwork "+emp[i].totalworkinghr);
            totalworkinghr=totalworkinghr+emp[i].totalworkinghr;
        }

        if(totalworkinghr>40)
        {   overtime=totalworkinghr-40;
            overtimepay=overtime*50;
            System.out.println("overtime pay is "+overtimepay);
        }
        else{
            System.out.println("no overtime");
        }
    }
}

public class Overtimeapp
{
    public static void main(String x[])
    {
        int id;
       String name;
       int totalworkinghr;
       int salary; 
       Employee5 emp[]=new Employee5[5];//array of referance
       
       for(int i=0;i<emp.length;i++)
       {
        Scanner xyz=new Scanner(System.in);
         System.out.println("enter name id totalworkinhr and salary of employee");

         name=xyz.nextLine();
         id=xyz.nextInt();
         totalworkinghr=xyz.nextInt();
         salary=xyz.nextInt();
         emp[i]=new Employee5(name,id,totalworkinghr,salary);//array of object


       }

       for(int i=0;i<emp.length;i++)
       {
         emp[i].DisplayInformation();
       }
       overtime ov=new overtime();
       ov.setemployee(emp);
       ov.calculateovertime();

    }
}