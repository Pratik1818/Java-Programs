import java.util.*;
public class sarithmetic{

    public static void main(String x[])
    {
        int a=0,b=0,c=0;
        Scanner xyz=new Scanner(System.in); 
        System.out.printf("enter a two number\n");
        a=xyz.nextInt();
        b=xyz.nextInt();
        c=a+b;
        System.out.printf("additon is %d\n",c);
         c=a-b;
        System.out.printf("substraction is %d \n",c);

        c=a*b;
        System.out.printf("multiplication is %d \n ",c);

        c=a/b;
        System.out.printf("division is %d \n ",c);

        xyz.close();



       


    }
}