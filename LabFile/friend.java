public interface Nesting
{
    void m1();

    interface Inner
    {
        void m2();
    }
}
class MyClass1 implements Nesting
{
    public void m1()
    {
        System.out.println("JAva lab Class");
    }
}
class MyClass2 implements Nesting.Inner
{
    public void m2()
    {
        System.out.println("Assignment");
    }
}
class friend
{
    public static void main(String args[])
    {
        MyClass1 c1 = new MyClass1();
        c1.m1();
        MyClass2 c2 = new MyClass2();
        c2.m2();
    }
}