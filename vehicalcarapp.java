 class vehicle
{
    String color="blue";
    int model=232;
    int year =2024;

    
}

class car extends vehicle{

    int numdoores=4;

    void dispalyallinfo()
    {
        System.out.println(color+ +model+ +year+ +numdoores);
    }
}