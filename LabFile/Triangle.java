class Triangle
{
    int height;
    int base;
    Triangle(int h,int b)
    {
        height=h;
        base=b;
    }
    void area()
    {
        System.out.println("Area of Triangle = "+0.5*base*height);
    }
    public static void main(String args[])
    {
        Triangle obj=new Triangle(23,7);
        obj.area();
    }
}
