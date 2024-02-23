class A
{
    A(int x,int y,float z)
    {   this(y,z);
        System.out.println("i am int constructor"+x);
    }
    A(int y,float z)
    {     this(z);
        System.out.println("i am integer cons"+y);
    }
    A(float z)
    {
        System.out.println("i am flaot"+z);
    }
}

class thisconapp
{  
     public static void main(String x[])
    {

    
       A a1=new A(10,20,4.5f);
     }
}