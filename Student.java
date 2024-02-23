import java.util.*;
public class Student{

    public static void main(String x[])
    {
        Scanner xyz=new Scanner(System.in);
         int id,marks;
         String name;
         float per;

        System.out.printf("enter a name of student\n");
        name=xyz.nextLine();

        System.out.printf("enter a id of student\n");
        id=xyz.nextInt();

        System.out.println("enter a marks of students");
        marks=xyz.nextInt();

        System.out.println("enter a percentage of students");
        per=xyz.nextFloat();

        System.out.printf("name is %S\n",name);
        System.out.printf("id is %d\n",id);
        System.out.printf("marks is %d\n",marks);
        System.out.printf("percentage is %f\n",per);

        xyz.close();


    }
}