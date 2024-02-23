import java.util.*;
import java.io.*;

public class AddNumericDataApp
{
    public static void main(String x[])throws FileNotFoundException,IOException
    {
        FileReader fr=new FileReader("E:\\pratikfile\\Demo1.txt");
        BufferedReader br=new BufferedReader(fr);

        String line;
        int sum=0;
        while((line=br.readLine())!=null)//this method is used to read line in file
        {
            for(int i=0;i<line.length();i++)
            {
                char ch=line.charAt(i);
                if(ch>=48 && ch<=57)
                {
                    int no=(int)ch-48;
                     sum=sum+no;
                     System.out.printf("%d",no);
                     System.out.printf("+");
                }
            }
        }

        System.out.printf("=%d",sum);

        
    }
}