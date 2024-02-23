import java.util.*;
abstract class image1
{
    abstract void rotateimage();
}


class clockwise extends image1{
     int img[][];
     void setimage(int img[][])
     {
        this.img=img;
     }
    public void rotateimage()
    {    int temp1=0;
        int temp3=0;
       for(int i=0;i<img.length;i++)
       {    boolean b=true;
         for(int j=0;j<img[i].length;j++)
         {  
             int temp=img[i][j];
             if(b==true)
             {
              temp1=temp;
             b=false;
             }
           img[i][j]=img[img[i].length-1-j][i];
           if(j==2)
           {     
               temp3=img[i][j];
           img[img[i].length-1-j][i]=temp1;
            img[j][i]=temp3;
             
           }
           else{
            img[img[i].length-1-j][i]=temp;
           }

           for(int k=0 ;k<1;k++)
           { 
              for(int m=0;m<img[k].length;m++)
              {
                System.out.print(img[k][m]+"\t");
              }
              System.out.println();
            
           }

         }

        
       }

      
    
    
       
    }
}

class anticlockwise extends image1{
    int img[][];
    void setimage(int img[][])
    {
       this.img=img;
    }
   public void rotateimage()
   {

   }
}

public class Image{
   public static void main(String x[])
   {
      int img[][]=new int[3][3];
      Scanner sc =new Scanner (System.in);
      System.out.println("enter a elements in array");

      for(int i=0;i<img.length;i++)
      {
        for(int j=0;j<img[i].length;j++)
        {
            img[i][j]=sc.nextInt();
        }
        System.out.println("\n");
      }

      clockwise cl=new clockwise();
      cl.setimage(img);
      cl.rotateimage();

      /*anticlockwise al=new anticlockwise();
      al.setimage(img);
      al.rotateimage();*/

   }
}