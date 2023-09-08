public class Rectangle
{
    private int len;
    private int bre;

    Rectangle(int len)
    {
        this.len = len;
    }
    Rectangle(int len, int bre)
    {
        this(len);
        this.bre = bre;
    }
    public int area()
    {
        return (len*bre);
    }
}
class Rect
{
    public static void main(String args[])
    {
        Rectangle r = new Rectangle(134,18);

        System.out.println("The Area of Rectangle is : "+ r.area());

    }
}