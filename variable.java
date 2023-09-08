class vari
{
    //static int a = 345;// static variable
    
    void v()
    {
        int s = 234; //local variable
        System.out.println("s = "+s);
    }    
}
class variable{
public static void main(String args[]) 
{
    int b = 567;//instance variable
    System.out.println("b = "+b);
    vari obj = new vari();
    vari.v();
    }
}