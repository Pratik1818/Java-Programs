class voterexception extends ArithmeticException
{
    String  geterror()
    {
        return "age is below 18";
    }
}

class votingmachine
{
    void verifyvote(int age)
    {
        if(age<18)
        {
            voterexception ve=new 
            voterexception();
            throw ve;
        }
        else{
            System.out.println("voter eligible");
        }
    }
}

public class voterexceptionapp2
{
    public static void main(String x[])
    {
        try{
            votingmachine vm=new votingmachine();
            vm.verifyvote(10);
        }
        catch(voterexception ve)
        {
            System.out.println("error is"+ve.geterror());
        }
    }
}