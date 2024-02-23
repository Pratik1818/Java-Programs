public class Equalsmethod
{
    public static void main(String x[])
    {
        String s=new String("pratik");
        String s1= new String("pratik");  //in string class equals method is overloaded for content comparison
        System.out.println(s.equals(s1));
    }
}