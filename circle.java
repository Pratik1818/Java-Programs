public class circle
{

    public static void main(String x[])
    {
        int r,Diameter;
        float pi=3.14f,area,Circum;
        r=Integer.parseInt(x[0]);

         
        area=pi*r*r;
        System.out.printf("area of cricle is %f\n",area);

        Diameter=2*r;
        System.out.printf("diameter of crcle is%d\n",Diameter);

        Circum=2*pi*r;
        System.out.printf("circum of crcle is%f\n",Circum);






    }
}