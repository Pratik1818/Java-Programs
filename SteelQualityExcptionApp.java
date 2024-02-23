import java.util.*;

class SteelException extends RuntimeException
{
    String Massege()
    {
        return " non of the conditon is met";
    }
}

class CheckQulity
{
    

    void checksteelquality(int hardness,float carbon,int Strength)
    {
        if(hardness<50 && carbon<0.7f && Strength>5600)
        {
            System.out.println("Grade is 10");
        }
        else if(hardness<50 && carbon<0.7f)
        {
            System.out.println("Grade is 9");
        }

        else if(carbon<0.7f && Strength>5600)
        {
            System.out.println("Grade is 8");
        }

        else if(hardness<50 && Strength>5600)
        {
            System.out.println("Grade is 7");
        }

        else if(hardness<50 || carbon<0.7f || Strength>5600)
        {
            System.out.println("Grade is 6"); 
        }

        else
        {
            System.out.println("Grade is 5");
            SteelException se=new SteelException();
            throw se;
        }
    }
}

public class SteelQualityExcptionApp
{
   public static void main(String x[])
   {
       int hardness;
       float carbon ;
       int Strength;

       Scanner sc =new Scanner(System.in);
       System.out.println("Enter hardeness of steel");
       hardness=sc.nextInt();
       System.out.println("carbon containt of steel");
       carbon=sc.nextFloat();
       System.out.println("Stength of steel");
       Strength =sc.nextInt();

       try{
        CheckQulity cq=new CheckQulity();
        cq.checksteelquality(hardness, carbon, Strength);
       }
       catch(SteelException se)
       {
        System.out.println("Exception is "+se.Massege()+"\t"+se);
       }

   }
}