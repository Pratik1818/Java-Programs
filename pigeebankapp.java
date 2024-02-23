class addamount
{
    int amount=50;
     
    addamount()
    {
       
    }
    addamount(int amt)
    {
        amount=amount+amt;
    }

    void getbalance()
    {
        System.out.println("final balance is"+amount);
    }
}


public class pigeebankapp
{
    public static void main(String x[])
    {
        addamount am=new addamount();
        am.getbalance();
        addamount am1=new addamount(20);
        am1.getbalance();

    }
}