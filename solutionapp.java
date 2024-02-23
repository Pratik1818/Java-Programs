import java.util.*;
class Library{
    private int number_of_books;
    private String name;
    private Map<String,Integer> bookGenres;

    public int getNumber_of_books()
    {
        return number_of_books;
    }
    public String getName()
    {
        return name;
    }

    public Map<String ,Integer> getBookGenres()
    {
        return bookGenres;
    }
    public void setNumber_of_books(int number_of_books )
    {
        this.number_of_books=number_of_books;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public void setBookGenres(Map<String ,Integer> bookGenres)
    {
         this.bookGenres=bookGenres;
    }
}

public class solutionapp
{
    public static void main(String x[])
    {
        Library s=new Library();
        Map<String,Integer> map=new HashMap<String,Integer>();

        s.setNumber_of_books(20);
        s.setName("National Library is started");
        
       String result= s.getName();
       System.out.printf("library with name %s\n",result);

       int result1=s.getNumber_of_books();
       System.out.printf("It contains %d books\n",result1);




    }
}