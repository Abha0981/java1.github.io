class inheritance 
{
    void ac()
    {
        System.out.println("Time is running"); 
    }   
}
class single extends inheritance
{
    void bc()
    {
        System.out.println("Out of time");
    }
}
class testinheritance{
    public static void main(String args[])
    {
        single s = new single();
        s.ac();
        s.bc();
    }
}