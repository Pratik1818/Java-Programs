import java.util.*;

class StudentEx extends RuntimeException{
    String AgeMassage()
    {
        return "invalid age";
    }

    String NameMassage()
    {
        return "Invalid name";
    }
}

class Student{
     int rollno;
     String name;
     int age;
     String course;

    Student(int rollno,String name,int age,String course)
    {
     this.rollno=rollno;
     this.name=name;
     this.age=age;
     this.course=course;
    }

    void checkage()
    {
        if(age>=15 && age<=21)
        {
            System.out.println("valid age");
        }
        else{
            StudentEx se=new StudentEx();
            throw se;
        }
    }
    void checkname()
    {   int count=0;
        for(int i=0;i<name.length();i++)
        {
            char ch=name.charAt(i);
            if((ch>=97 && ch<=122)||(ch>=65 && ch<=90))
            {
                count++;
            }
            
        }

        System.out.println(name.length());
        System.out.println(count);
        if(count==name.length())
        {   
            System.out.println("valid name");
        }
        else{
            StudentEx se=new StudentEx();
            throw se;
        }
    }
}

public class StudentExceptionApp
{
    public static void main(String x[])

    {   Student s=new Student(1, "pr23tik", 12, "java");
        try{
         s.checkage();
        }
        catch(StudentEx se)
        {
            System.out.println(se.AgeMassage());
        }

        try{
            s.checkname();
           }
           catch(StudentEx se)
           {
               System.out.println(se.NameMassage());
           }


        

    }
}