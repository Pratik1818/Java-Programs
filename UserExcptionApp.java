class EmailException extends ArrayIndexOutOfBoundsException
{
    public String getmsg()
    {
        return "valid email";
    }
}

class verifyemail
{
    void verify(String s)
    {   
        
        if(s.endsWith("@gmail.com"))//or s=="pratikchavan@gmail.com"
        {
              EmailException ex=new EmailException();
              throw ex;
        }

        else{
            System.out.println("invalid voter");

        }
    }
}

public class UserExcptionApp
{  
    public static void main(String x[])
    {
        try{
            verifyemail ve=new verifyemail();
            ve.verify("pratikchavan@gmail.mom");
        }
        catch(EmailException ex)
        {
            System.out.println(ex.getmsg());
        }
    }

}