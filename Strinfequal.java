public class Strinfequal
{
  public static void main(String x[])
  {   String s1=" ";
     String s=new String("java");
     System.out.println(s.equals("java"));//true
     System.out.println(s.compareTo("java"));//0
     System.out.println(s.equals("JAVA"));//false
     System.out.println(s.equalsIgnoreCase("JAVA"));//true
     System.out.println(s.hashCode());
     System.out.println(s);
     
     for(int i=0;i<s.length();i++)
     {
        char ch=s.charAt(i);
        if(ch>=97 && ch<=122)
        {
            char asc=(char) ((int)ch-32);
            s1=asc+s1;  //reverse string
        }
     }

     System.out.println(s1);

     System.out.println(s.substring(2));
     System.out.println(s.substring(2,3));


     


     
  }

}