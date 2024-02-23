import java.util.*;
class array
{
    int a[];
    void setarray(int ar[])
    {
        a=ar;
    }

    void insert()
    {   Scanner xyz=new Scanner(System.in);
        int index ,value;
        System.out.println("enter a value: ");
        value=xyz.nextInt();
        System.out.println("enter a index:");
        index=xyz.nextInt();

        int newarr[]=new int[a.length+1];
        for(int i=0;i<newarr.length;i++)
        {
            if(i<index)
            {
                newarr[i]=a[i];
            }
            else if(i==index){
                newarr[i]=value;
            }

            else
            {
                newarr[i]=a[i-1];
            }
        }
        
        
        System.out.println("array after insert a value at a perticular index");
        for(int i=0;i<newarr.length;i++)
        {
            System.out.printf("%d \t",newarr[i]);
        }

    }
}

public class Arrayinsert
{
    public static void main(String x[])
    {   Scanner xyz=new Scanner(System.in);

        int a[]=new int[5];
        System.out.println("enter a elements in array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=xyz.nextInt();
        }

        array aobj=new array();
        aobj.setarray(a);

        aobj.insert();

    }
}