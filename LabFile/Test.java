import java.lang.String;
public class Test
{
    private String ss;
    int num;
    public void setName(String s)
    {
        ss=s;
    }
    public String getName()
    {
        return ss;
    }
}
class Test2
{
    public static void main(String args[])
    {
        Test s = new Test();
        s.setName("Java Labfile Time");
        s.num=90;
        System.out.println(s.getName()+" "+s.num);
        System.out.println();
    }
}
