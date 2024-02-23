 class student
 {   String s;
    int i;
    student( String s, int i)
    {
        this.s=s;
        this.i=i;

    }
    public boolean equals(Object s1) throws ClassCastException
    {         if(s1 instanceof student)
        {
                 student s= student(s1);  
        }
    }
 }

public  class Equalmethod1
{
    public static void main(String x[])
    {
        student s=new student("pratik",101);
         student s1=new student("pratik",101);
       
         boolean b=s.equals(s1);
         System.out.println(b);
    }
}