interface Abhi {
    void a();
}
interface Vij {
    void b();
}
class multiple implements Abhi, Vij{
   public void a()
    {
        System.out.println("Abhi : Virat");
    }
    public void b()
    {
        System.out.println("Akhi : Viji");
    }
public static void main(String args[]) 
{
    multiple obj = new multiple();
    obj.a();
    obj.b();
}
}