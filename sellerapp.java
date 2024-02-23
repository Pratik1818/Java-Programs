import java.util.*;

class seller
{
    int Sel;
    int Cost;
    int profit;
    int loss;
    void setsellingcostprice(int Sel,int Cost)
    {
        this.Sel=Sel;
        this.Cost=Cost;
    }
    void showprofitloss()
    {
        if(Sel>Cost)
        {
            profit=Sel-Cost;
            System.out.println("profit is "+profit);
        }

        else{

            loss=Cost-Sel;
            System.out.println("loss is "+loss);
        }
    }
}

 public class sellerapp
{
    public static void main(String x[])
    {   int cost,sel;
        Scanner xyz=new Scanner(System.in);
        System.out.println("enter a value of selling price and cost price ");
        sel=xyz.nextInt();
        cost=xyz.nextInt();
        seller se=new seller();
        se.setsellingcostprice(sel,cost);
        se.showprofitloss();

    }
}

