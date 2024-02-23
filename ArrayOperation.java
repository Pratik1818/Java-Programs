import java.util.*;

interface Arayyoper
{
     void performOperation(int a[]);
}

class sort implements Arayyoper
{
    public void performOperation(int a[])
    {
        for (int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int  temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }

        System.out.println("sorted array is");

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}

class insertion implements Arayyoper
{   int index;
    int value;
   public  void setvalue(int index,int value)
    {
        this.index=index;
        this.value=value;
    }

   public void  performOperation(int a[])
   {
       for(int i=a.length-1;i<index;i--)
       {
         a[i+1]=a[i];
       }
       a[index]=value;

       for(int i=0;i<=a.length;i++)
       {
         System.out.print(a[i]+"\t");
       }
   }
}

class delete implements Arayyoper
{   
    int index;
    
    void setvalue(int index)
    {
        this.index=index;
        
    }

    public void performOperation(int a[])
    {
       for(int i=index;i<a.length-1;i++)
       {
        a[i]=a[i+1];
       }

       System.out.println("array after deletating element");

       for(int i=0;i<a.length-1;i++)
       {
         System.out.print(a[i]+"\t");
         
       }
    }
}

class Reverse implements Arayyoper
{
    public void performOperation(int a[])
    {
        for(int i=0;i<a.length/2;i++)
        {   int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        for (int i=0;i<a.length;i++)
    {
        System.out.print(a[i]);
    }
}
    }

    
public class ArrayOperation
{
  public static void main(String x[])
  {  Scanner sc=new Scanner(System.in);
    int choice;
    int a[]=new int[6];
    System.out.println("enter a element in array");
    for(int i=0;i<a.length;i++)
    {
        a[i]=sc.nextInt();
    }

    do{
        
        System.out.println("1.sort");
        System.out.println("2.insertion");
        System.out.println("3.delete");
        System.out.println("4.reverse");

        System.out.println("enter your choice");
        choice=sc.nextInt();

        switch(choice)
        {
            case 1:
            {
                sort s=new sort();
                s.performOperation(a);
            }
            break;
            case 2:
            {
               insertion i=new insertion();
               i.setvalue(3, 10);
               i.performOperation(a);
            }

            break;
            case 3:
            {
                delete d=new delete();
                d.setvalue(2);
                d.performOperation(a);
            }
            break;
            case 4:
            {
                Reverse  r=new Reverse ();
                r.performOperation(a);
            }
            break;
        }




    }while(true);

  }
}

