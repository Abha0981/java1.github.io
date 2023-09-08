class Abhi 
{
    void a()
    {
        System.out.println("Abha, Akhi, Shree");
    }
}
class Shree extends Abhi
{
    void a()
    {
        System.out.println("Jyoti, ");
    }
    void c()
    {
        System.out.println("Captain, Superman, Shikha");
    }
    void b()
    {
        super.a();
        a();
    }
}
class super1
{
    public static void main(String args[]) 
    {
        Shree s = new Shree();
        s.b();
        s.c();
    }
}