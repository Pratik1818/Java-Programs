import java.util.*;

class StudentApp
{


    int id;
    String  name;
    Double per;
    int totalfees;
    int disfees;
    int actualpaidfees;

    void setId(int id)
    {
        this.id=id;
    }

    int getId()
    {
        return id;
    }

    void setName(String name)
    {
        this.name=name;
    }

    String getName()
    {
        return name;
    }

    void setPer(Double per)
    {
        this.per=per;
    }

    Double getPer()
    {
        return per;
    }

     void setTotalFees(int totalfees)
     {
         this.totalfees=totalfees;
     }

     int getTotalFees()
     {
        return totalfees;
     }

     void setDisFees(int disfees)
     {
        this.disfees=disfees;
     }

     int getDisFees()
     {
        return disfees;
     }
    

      void setActualPaidFees(int actualpaidfees)
      {
        this.actualpaidfees=actualpaidfees;
      }

      int getActualPaidFees()
      {
        return actualpaidfees;
      }
    }

    class data
    {   
        int tf,disfees,acutalpaidfees;
        StudentApp studentapp;

        void setdetails(StudentApp studentapp)
        {
            this.studentapp=studentapp;
        }

        void checkeligibal(Double per)
        {
            if(per>60)
            {
                 tf=studentapp.getTotalFees();
                 disfees=((tf*30)/100);
                 acutalpaidfees=tf-disfees;

                 
            }
            studentapp.setDisFees(disfees);
            studentapp.setActualPaidFees(acutalpaidfees);
        }

        void showdetails()
        {
            System.out.println(+studentapp.getId()+"\t"+studentapp.getName()+"\t" +studentapp.getTotalFees()+"\t"+studentapp.getActualPaidFees()+"\t"+studentapp.getDisFees());
        }
    }

     public class studentdataapp
     {
        public static void main(String x[])
        {   
            
            Scanner xyz=new Scanner (System.in);
            System.out.println("enter a value of id name per and totalfees");
            /*int  id=xyz.nextInt();
            String name = xyz.nextLine();
            Double per = xyz.nextDouble();
            int totalfees = xyz.nextInt();*/
            StudentApp sd = new StudentApp();
            sd.setId(1);
            sd.setName("pratik");
            sd.setPer(62.34);
            sd.setTotalFees(10000);

            data dt=new data();
            
            dt.setdetails(sd);
            dt.checkeligibal(62.34);
            dt.showdetails();

        }

     }