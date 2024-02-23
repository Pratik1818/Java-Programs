class animal
{
    int eat;
    void sleep()
    {
        System.out.println("i am a animal class method");
    }
}

class dog extends animal{
    int bark;
    void breed()
    {
        System.out.println("i am child class breed method");
    }
}

public class AnimalDogApp
{
    public static void main(String x[])
    {
        dog d=new dog();
        d.breed();
        d.sleep();

;    }
}