
public class valueof
{
    public static void main(String x[])
    {    int i=10;
        Integer I= Integer.valueOf(i);
        Character ch =Character.valueOf('a');
        System.out.println(I);

        StringBuffer sb =new StringBuffer();
        sb.append("pratik").append("chavan").insert(2,"18");
        System.out.println(sb);
    }
}