import java.util.*;

class StudentApp
{


    int id;
    String  name;
    float per;
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

    void setPer(float per)
    {
        this.per=per;
    }

    float getPer()
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

        void checkeligibal(float per)
        {
            if(per>60)
            {
                 tf=studentapp.getTotalFees();
                 disfees=tf-((tf*30)/100);
                 acutalpaidfees=tf-disfees;

                 
            }
            studentapp.setDisFees(disfees);
            studentapp.setActualPaidFees(acutalpaidfees);
        }

        void showdetails()
        {
            System.out.println(+studentapp.getId()+studentapp.getName());
        }
    }

     public class studentdiscountapp
     {
        public static void main(String x[])
        {    int id;
            String  name;
            float per;
            int totalfees;
            Scanner xyz=new Scanner(System.in);
            System.out.println("enter a value of id name per and totalfees");
            id=xyz.nextInt();
             name=xyz.nextLine();
            per=xyz.nextFloat();
            totalfees= xyz.nextInt();
            StudentApp sd = new StudentApp();
            sd.setId(id);
            sd.setName(name);
            sd.setPer(per);
            sd.setTotalFees(totalfees);

            data dt=new data();
            
            dt.setdetails(sd);
            dt.checkeligibal(per);
            dt.showdetails();

        }

     }





    
