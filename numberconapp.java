 class NumberConversion
 {   int rem,no;
    int binary;
    int b[]=null;
    int i=0;
    int decimal=0;
    
    
    NumberConversion(int no)

    {     this.no=no;
        if(no<=15)
        {
            b= new int[4];
        }
        
        while(no!=0)
        {
            rem=no%2;
            no=no/2;
            b[i++]=rem;
        }

        for(int i=0;i<b.length/2;i++)
        {
            int temp=b[i];
            b[i]=b[b.length-1-i];
            b[b.length-1-i]=temp;


        }
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]);
        }


    }

    NumberConversion(int bin[])
    {
        for(int i=0;i<bin.length/2;i++)
        {
            int temp=bin[i];
            bin[i]=bin[bin.length-1-i];
            bin[bin.length-1-i]=temp;

        }
        int power=1;
        for(int i=0;i<bin.length;i++)
        {   
            
             
             decimal=decimal+(bin[i]*power);

             power=power*2;
        }

        System.out.println("decimal is "+decimal);


    }


 }

 public class numberconapp
 {
    public static void main(String x[])
    {
        NumberConversion nc=new NumberConversion(10);

        int bin[]=new int[4];
        bin[0]=1;
        bin[1]=0;
        bin[2]=1;
        bin[3]=0;

        for(int i=0;i<bin.length;i++)
        {
            System.out.print(bin[i]);
        }

        NumberConversion nc1=new NumberConversion(bin);


    }
 }