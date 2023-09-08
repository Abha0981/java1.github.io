final class FinalKeyword
{
    public final void display()
    {
        System.out.println("This is Amity University in Gwalior");
    }
    static class Main8 extends FinalKeyword
    {
        static public void output()
        {
            final String name = "This is 100 acre campus in Gwalior";
            System.out.println("Final Variable Name is :- " + name);
        }
    }
    public static void main(String args[])
    {
        FinalKeyword obj = new FinalKeyword();
        obj.display();
        Main obj1 = new Main();
        obj1.output();
    }
}