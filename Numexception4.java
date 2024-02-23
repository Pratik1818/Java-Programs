import java.util.*;
public class Numexception4 {
public static void main(String[] args) {
       try {  
	   Scanner xyz  = new Scanner(System.in);
         System.out.println("Enter value");
         int val=xyz.nextInt();
         int sq=val*val;
         System.out.printf("Square is %d\n", sq);
       }
       catch(Exception ex)
       {
    	   System.out.println("Error is "+ex);
       }
	}
}
