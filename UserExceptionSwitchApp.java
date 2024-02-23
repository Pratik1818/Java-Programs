import java.util.*;
class VoterException extends ArithmeticException
     {
        String Massege()
         {
             return "age is below 18 voter is not elgible";
         }
     }

     class checkage
     {
        void checkeligibility(int age)
         {
              if(age>=18)
             {
               System.out.println("voter is eligible");
             }
             else
                 {
                  VoterException ve=new VoterException();
                     throw ve;
                 }
         }
    }

    class EmpEligibility extends ArithmeticException
    {
        String Massege()
        {
            return"employee is not eligible";
        }
    }

    class CheckEmp
    {   
        void checkempeligibility(int salary )
        {
            if(salary>25000)
            {
                System.out.println("emp is eligible ");
            }
            else{
                EmpEligibility emp=new EmpEligibility();
                 throw emp;
            }
        }
    }

    class OddException extends RuntimeException
    {
         String Massege()
         {
            return "given number is odd";
         }
    }

    class CheckOdd
    {
        void checkoddnum(int no)
        {
            if(no%2==0)
            {
                System.out.println("valid no");
            }
            else{
                OddException oe=new OddException();
                throw oe;
            }
        }
    }

   class  ElementDuplicateException extends RuntimeException
   {
      String Massege()
      {
        return "array contain duplicate";
      }
   }

   class CheckDuplicate
   {    int count=0;
       void checkelement(int a[])
       {
            for(int i=0;i<a.length;i++)
            {
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[i]>a[j])
                    {
                     int temp=a[i];
                     a[i]=a[j];
                     a[j]=temp;
                    }
                }
            }
            
            for(int i=0;i<a.length;i=count+i)
            {    count=0;
                for(int j=i;j<a.length;j++)
                {
                    if(a[i]==a[j])
                    {
                       count++;
                       if(count>1)
                       {
                        ElementDuplicateException ed=new ElementDuplicateException();
                        throw ed;
                         
                       }
                    }
                }
            }
       }
   }

   class VoewlException extends RuntimeException
   {
     String Massege()
     {
         return "String does not contain vowel";
     }
   }

   class CheckVoewl
   {   boolean b=true;;
      void checkvoewl1(String s)
      { 
          for(int i=0;i<s.length();i++)
          {
              char ch=s.charAt(i);
              if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
              {
                  b=false;
              }
          }

          if(b)
          {  VoewlException ve=new VoewlException();
            throw ve;
             
          }
          else{
            System.out.println("String contain vowel ");
          }
         
      }

   }

public class UserExceptionSwitchApp
{  
    public static void main(String x[])
    {    Scanner sc =new Scanner(System.in);
        int choice;

        
        do{
            System.out.println("1.to check voter eligibility");
            System.out.println("2. employee Elgibiltiy");
            System.out.println("3.Number is odd");
            System.out.println("4.if number are duplicate in array");
            System.out.println("5.if String does not contain vowels");
            System.out.println("enter your choice");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {   
                        int age ;
                        System.out.println("enter a age");
                        age=sc.nextInt();
                        try{
                            checkage ch=new checkage();
                            ch.checkeligibility(age);
                        }
                        catch(VoterException ve)
                        {
                            System.out.println("Exception "+ve.Massege());
                        }
                    }
                
                
                break;

                case 2:
                {
                    int salary;
                    System.out.println("enter a salary");
                    salary=sc.nextInt();
                    try{
                        CheckEmp ce=new CheckEmp();
                        ce.checkempeligibility(salary);
                    }
                    catch(EmpEligibility emp)
                    {
                        System.out.println(emp.Massege());
                    }
                }
                break;

                case 3:
                {
                      int no;
                      System.out.println("enter a number");
                      no=sc.nextInt();
                      try{
                        CheckOdd cd=new CheckOdd();
                        cd.checkoddnum(no);
                    }
                    catch(OddException oe)
                    {
                        System.out.println("Exception is "+oe+"\t"+oe.Massege());
                    }
                }

                case 4:
                {
                    int a[]=new int[5];
                    System.out.println("enter a elements in array");
                    for(int i=0;i<a.length;i++)
                    {
                        a[i]=sc.nextInt();
                    }

                    try
                    {
                        CheckDuplicate cd=new CheckDuplicate();
                        cd.checkelement(a);

                    }
                    catch(ElementDuplicateException ed){

                        System.out.println("Exception is "+ed+"\t"+ed.Massege());
 
                    }
                }

                case 5:
                {
                    String s;
                    System.out.println("enter a string");
                    s=sc.next();

                    try{
                         CheckVoewl cv=new CheckVoewl();
                         cv.checkvoewl1(s);
                    }
                    catch(VoewlException ve)
                    {
                        System.out.println("Exception is "+ve.Massege()+"\t"+ve);
                    }
                }
            
            }   
        }while(true);
    }
}