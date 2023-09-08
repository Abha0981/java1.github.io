public class Default
{
    int  num1;
    int  num2;
    Default()
    {
        num1 = 10;
        num2 = 50;
        System.out.println("Default Constructor sum :- ");
    }

    public void display(){
        System.out.println("num1 = "+ num1);
        System.out.println("num2 = "+ num2);
    }
}
class Main3{
    public static void main(String args[])
    {
        Default d = new Default();
        d.display();
    }
}
