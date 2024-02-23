import java.util.*;

public class autounbox{
    public static void main(String x[])
    {
        int i=10;
        Integer i1=Integer.valueOf(i);
        int i2=i1;

        char ch='a';
        Character ch1=Character.valueOf(ch);
        char ch2=ch1;

        short s=10;
        Short s1=Short.valueOf(s);
        short s2=s1;

        long l=10;
        Long l1=Long.valueOf(l);
        long l2=l1;

        double d=4.32;
        Double d1=Double.valueOf(d);
        double d2=d1;

        boolean b=true;
        Boolean b1=Boolean.valueOf(b);
        boolean b2=b1;

        byte b3= 1;
        Byte b4= Byte.valueOf(b3);
        byte b5=b4;

        float  f=3.4f;
        Float f2=Float.valueOf(f);
        float f3=f2;
        


        
    }
}