class parent
{
       void show()
    {
        System.out.println("i am a parent method");
    }
}

class child extends parent{
      void show()
    {
        System.out.println("i am a child method");
    }

    void display()
    {
        System.out.println("i am a display method");
    }
}

public class StaticmethodApp
{
    public static void main(String x[])
    {
        parent pa=new child();
        pa.show();
        

     

    }
}