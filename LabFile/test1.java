class Area
{
    void area(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y);
    }
    void area(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z);
    }
}
class test1
{
    public static void main(String args[])
    {
        Area cal = new Area();
        cal.area(1,2);
        cal.area(25);
    }
}